import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getByIdRequest {

    public static void main(String[] args) {

        int userId = 1; // you can change to any user ID

        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/{id}")
                .header("x-api-key", "reqres-free-v1")
                .pathParam("id", userId)   // inject ID into path
                .when()
                .get()
                .then()
                .statusCode(200)
                .extract()
                .response();

        response.prettyPrint();
    }
}
