package ru.netology.rest;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class PostmanEchoApiTest {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        // Предусловия
        given()
            .baseUri("https://postman-echo.com")
            .body("passport: 1111 111111") // отправляемые данные (заголовки и query можно выставлять аналогично)
        // Выполняемые действия
        .when()
            .post("/post")
        // Проверки
        .then()
            .statusCode(200)
            .body("data", equalTo("some data"))
        ;
    }
}
