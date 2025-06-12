package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static config.ConfigManager.getRequestSpec;

public class UserAPITest {

    @Test
    public void testGetUser() {
        System.out.println("INICIANDO TEST: testGetUser");
        Response response = getRequestSpec()
                .get("/users/1");
        
        System.out.println("Endpoint: GET /users/1");
        System.out.println("Código de respuesta: " + response.getStatusCode());
        System.out.println("Body:\n" + response.getBody().asPrettyString());
        
        System.out.println("Obtener usuario: " + response.getBody().asString());

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().getString("id"), "1");
    }

    @Test
    public void testGetInvalidUser() {
        Response response = getRequestSpec()
                .get("/users/9999");

         System.out.println("TEST FINALIZADO: testGetUser");

        // JSONPlaceholder responde 404 para usuarios inválidos
        assertEquals(response.getStatusCode(), 404);
    }
}
