import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestNoBddStyle {
    public static void main(String[] args) {

        int userId = 1; // you can change to any user ID

        // Send GET request without BDD style
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/{id}")
                .header("x-api-key", "reqres-free-v1")
                .pathParam("id", userId)
                .get(); // direct GET call

        // Print response status code
        System.out.println("Status Code: " + response.getStatusCode());

        // Print response body
        System.out.println("Response Body:");
        response.prettyPrint();
    }
}
