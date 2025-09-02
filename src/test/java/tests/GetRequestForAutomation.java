package tests;

import io.qameta.allure.Description;
import io.qameta.allure.testng.AllureTestNg;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({io.qameta.allure.testng.AllureTestNg.class})

public class GetRequestForAutomation {
    @Test
    @Description("Verify GET users returns 200 status code")
    public void testGetUsers() {

        // Send GET request with query parameter and header
        Response response = RestAssured
                .given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .queryParam("page", "2")  // use queryParam for page
                .header("x-api-key", "reqres-free-v1")
                .get(); // direct GET call (non-BDD style)

        // Assert the status code
        Assert.assertEquals(response.getStatusCode(), 200, "Status code should be 200");

        // Print full response body (optional for debugging)
        response.prettyPrint();
    }
}
