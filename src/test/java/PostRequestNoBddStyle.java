import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

public class PostRequestNoBddStyle {

    public static void main(String[] args) {

        // JSON body
        String requestBody = "{\n" +
                "    \"name\": \"John Doe\",\n" +
                "    \"job\": \"Developer\"\n" +
                "}";

        // Send POST request (non-BDD style)
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .header("x-api-key", "reqres-free-v1")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .post();  // direct POST call without then()

        // Print response status code
        int statuscode =response.getStatusCode();
        System.out.println("Status Code: " + statuscode );
        Assert.assertEquals(statuscode ,201);

        // Print response body
        System.out.println("Response Body:");
        response.prettyPrint();
    }

}
