package config;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ConfigManager {

    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";

    public static RequestSpecification getRequestSpec() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .header("Content-Type", "application/json");
                // .header("Authorization", "Bearer tu_token") // si aplica
    }
}
