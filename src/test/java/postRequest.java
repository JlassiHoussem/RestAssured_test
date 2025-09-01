import io.restassured.RestAssured;
import io.restassured.response.Response;

public class postRequest {
    public static void main(String[] args) {
    // JSON body
    String requestBody = "{\n" +
            "    \"name\": \"John Doe\",\n" +
            "    \"job\": \"Developer\"\n" +
            "}";

    // Send POST request
    Response response = RestAssured
            .given()
            .baseUri("https://reqres.in")
            .basePath("/api/users")
            .header("x-api-key", "reqres-free-v1")
            .header("Content-Type", "application/json")
            .body(requestBody)  // attach JSON body
            .when()
            .post()
            .then()
            .statusCode(201) // expect Created
            .extract()
            .response();

    // Print response body
        response.prettyPrint();
}
}

