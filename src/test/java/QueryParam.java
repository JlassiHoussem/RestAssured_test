import io.restassured.RestAssured;
import io.restassured.response.Response;

public class QueryParam {
    public static void main(String[] args) {
        int pageNumber = 2; // change this to test other pages

        // Send GET request with query parameter (non-BDD style)
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .header("x-api-key", "reqres-free-v1")
                .queryParam("page", pageNumber) // add query param ?page=2
                .get();

        // Print response status code
        System.out.println("Status Code: " + response.getStatusCode());

        // Print response body
        System.out.println("Response Body:");
        response.prettyPrint();
    }
    }

