import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Step_Test {

    PageTeste pagetest = new PageTeste();

    @Test
    @Order(1)
    public void NovoProduto() throws IOException {
        pagetest.criarproduto();
    }

    @Test
    @Order(2)
    public void BuscarProdutoRecemCriado() {
        pagetest.BuscarProdutoCriado();
    }

    @Test
    @Order(3)
    public void AtualizarProdutoCriado() throws IOException {
        pagetest.AtualizarProduto();
    }

    @Test
    @Order(4)
    public void DeletarProdutoCriado() {
        pagetest.DeletarProduto();
    }

    @Test
    @Order(5)
    public void BuscarProdutoDeletado() {
        pagetest.BuscarProdutoDeletado();
    }
}
