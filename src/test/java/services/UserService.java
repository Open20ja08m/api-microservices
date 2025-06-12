package services;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Map;

public class UserService {

    public Response createUser(Map<String, Object> userData) {
        return given()
                .header("Content-Type", "application/json")
                .body(userData)
                .when()
                .post("/users");
    }

    public Response getUserById(int id) {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .get("/users/" + id);
    }

    public Response deleteUserById(int id) {
        return given()
                .header("Content-Type", "application/json")
                .when()
                .delete("/users/" + id);
    }
}
