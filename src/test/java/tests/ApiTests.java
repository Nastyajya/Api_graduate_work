package tests;


import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import models.*;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static specs.EmployeesSpec.*;

@Tag("api_test")
public class ApiTests {
    @Owner("a.zelenskaia")
    @Feature("API test")

    @Test
    void checkEmployeeByIndex() {
        List<EmployeesModel> employeesResponse = step("Make request", () ->
                given(employeesRequestSpec)
                        .get("/employees")
                        .then()
                        .spec(employeesResponseSpec)
                        .extract()
                        .jsonPath().getList("data", EmployeesModel.class)
        );

        step("Check response id and name", () -> {
            assertEquals(1, employeesResponse.get(0).getId());
            assertEquals("Tiger Nixon", employeesResponse.get(0).getEmployee_name());
            assertEquals(2, employeesResponse.get(1).getId());
            assertEquals("Garrett Winters", employeesResponse.get(1).getEmployee_name());
        });
    }

    @Test
    void exampleGetTest() {
        Map<String, Object> employeesResponse = step("Make request", () ->
                given(exampleRequestSpec)
                        .get("/employee/5")
                        .then()
                        .spec(exampleResponseSpec)
                        .extract()
                        .jsonPath().getMap("data")
        );

        step("Check response id and name", () -> {
            assertEquals(5, employeesResponse.get("id"));
            assertEquals("Airi Satou", employeesResponse.get("employee_name"));
        });
    }

    @Test
    void postCreateTest() {
        CreateModel dataCreate = new CreateModel();
        dataCreate.setName("test");
        dataCreate.setSalary("123");
        dataCreate.setAge("23");

        Map<String, Object> createResponse = step("Make request", () ->
                given(createRequestSpec)
                        .body(dataCreate)
                        .post("/create")
                        .then()
                        .spec(createResponseSpec)
                        .extract()
                        .jsonPath().getMap("data")
        );
        step("Check response", () -> {
            assertEquals("test", createResponse.get("name"));
            assertEquals("123", createResponse.get("salary"));
            assertEquals("23", createResponse.get("age"));
        });
    }

    @Test
    void updatePutTest() {
        UpdateRequestModel dataUpdate = new UpdateRequestModel();
        dataUpdate.setName("Alex");

        Map<String, Object> updateResponse = step("Make request ", () ->
                given(updateRequestSpec)
                        .body(dataUpdate)
                        .put("update/21")
                        .then()
                        .spec(updateResponseSpec)
                        .extract()
                        .jsonPath().getMap("data")
        );

        step("Check name", () -> {
            assertEquals("Alex", updateResponse.get("name"));
        });
    }

    @Test
    void deleteTest() {
        DeleteResponseModel deleteResponse = step("Ask for deletion", () ->
                given(deleteRequestSpec)
                        .delete("/delete/2")
                        .then()
                        .spec(deleteResponseSpec)
                        .extract().as(DeleteResponseModel.class)
        );
        step("Checking response for deletion", () -> {
            assertEquals("success", deleteResponse.getStatus());
        });
    }

}
