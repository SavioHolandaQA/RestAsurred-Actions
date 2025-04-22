import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class PageTeste {

    private static final String BASE_URL = "https://api.restful-api.dev/objects";
    private static String IdCriado;

    public void criarproduto() throws IOException {
        String jsonBody = new String(Files.readAllBytes(Paths.get("src/test/resources/payloads/generates_product.json")));

        Response response = given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post(BASE_URL)
                .then()
                .statusCode(200)
                .body("name", equalTo("Apple Pro 16"))
                .extract()
                .response();

        IdCriado = response.path("id");

    }

    public void BuscarProdutoCriado() {
        given()
                .when()
                .get(BASE_URL + "/" + IdCriado)
                .then()
                .statusCode(200)
                .body("id", equalTo(IdCriado))
                .body("name", equalTo("Apple Pro 16"));
    }

    public void AtualizarProduto() throws IOException {
        String jsonAtualizado = new String(Files.readAllBytes(Paths.get("src/test/resources/payloads/update.json")));

        given()
                .contentType(ContentType.JSON)
                .body(jsonAtualizado)
                .when()
                .put(BASE_URL + "/" + IdCriado)
                .then()
                .statusCode(200)
                .body("name", equalTo("Apple Pro 520"))
                .body("data.color", equalTo("Navy blue"));
    }

    public void DeletarProduto() {
        given()
                .when()
                .delete(BASE_URL + "/" + IdCriado)
                .then()
                .statusCode(200)
                .body("message", containsString(IdCriado));
    }

    public void BuscarProdutoDeletado() {
        given()
                .when()
                .get(BASE_URL + "/" + IdCriado)
                .then()
                .statusCode(404);
    }
}