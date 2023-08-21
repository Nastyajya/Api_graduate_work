package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.*;
import static io.restassured.http.ContentType.JSON;

public class EmployeesSpec {
    public static RequestSpecification employeesRequestSpec = with()
            .log().all()
            .when()
            .filter(withCustomTemplates())
            .baseUri("https://dummy.restapiexample.com")
            .basePath("/api/v1/");
    public static ResponseSpecification employeesResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(ALL)
            .expectStatusCode(200)
            .build();
    public static RequestSpecification exampleRequestSpec = with()
            .log().uri()
            .log().method()
            .log().body()
            .filter(withCustomTemplates())
            .when()
            .baseUri("https://dummy.restapiexample.com")
            .basePath("/api/v1/");
    public static ResponseSpecification exampleResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();

    public static RequestSpecification createRequestSpec = with()
            .log().uri()
            .log().method()
            .log().body()
            .filter(withCustomTemplates())
            .contentType(JSON)
            .log().body()
            .when()
            .baseUri("https://dummy.restapiexample.com")
            .basePath("/api/v1/");
    public static ResponseSpecification createResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();

    public static RequestSpecification updateRequestSpec = with()
            .log().all()
            .contentType(JSON)
            .filter(withCustomTemplates())
            .when()
            .baseUri("https://dummy.restapiexample.com")
            .basePath("/api/v1/");

    public static ResponseSpecification updateResponseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();

    public static RequestSpecification deleteRequestSpec = with()
            .log().all()
            .log().method()
            .log().body()
            .filter(withCustomTemplates())
            .when()
            .baseUri("https://dummy.restapiexample.com")
            .basePath("/api/v1/");

    public static ResponseSpecification deleteResponseSpec =  new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .expectStatusCode(200)
            .build();
}
