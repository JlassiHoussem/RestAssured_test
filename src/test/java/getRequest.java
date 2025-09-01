import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequest {

    public static void main(String[] args) {

        //api reqres.in
        //RestAssured.given().baseUri("https://reqres.in/api/users").when().get().prettyPrint();

        // Send GET request with header
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .queryParams("page","2")
                .header("x-api-key", "reqres-free-v1") // required header
                .when()
                .get()
                .then()
                .statusCode(200)  // validate that status code is 200
                .extract()
                .response();

        // Print full response body
        response.prettyPrint();
    }
}
