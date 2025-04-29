

# 🧪 Testes Automatizados de API com Java + RestAssured

![Java CI](https://github.com/SavioHolandaQA/RestAsurred-Actions/actions)

Este projeto implementa testes automatizados para uma API REST pública utilizando **Java**, **RestAssured**, **JUnit 5** e o padrão **Page Object Model (POM)**. O pipeline de integração contínua é feito com **GitHub Actions**.

---

## 🚀 Funcionalidades Testadas

O fluxo de testes cobre o ciclo de vida completo de um produto na API:

1. ✅ Criar um novo produto (`POST`)
2. 🔍 Buscar o produto recém-criado (`GET`)
3. ✏️ Atualizar o produto (`PUT`)
4. 🗑️ Deletar o produto (`DELETE`)
5. ❌ Verificar que o produto foi deletado (`GET` → 404)

---

## 🧪 Tecnologias Utilizadas

- Java 11
- Maven
- RestAssured
- JUnit 5
- Page Object Model (POM)
- GitHub Actions (CI)

---

Exemplo de Payloads
generates_product.json
json
Copiar
Editar
{
  "name": "Apple Pro 16",
  "data": {
    "year": 2022,
    "price": 2500,
    "CPU model": "M2",
    "Hard disk size": "1 TB"
  }
}
update.json
json
Copiar
Editar
{
  "name": "Apple Pro 520",
  "data": {
    "color": "Navy blue"
  }
}

👤 Autor
Sávio Holanda do Nascimento

