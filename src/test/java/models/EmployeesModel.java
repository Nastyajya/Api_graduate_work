package models;

import lombok.Data;

@Data
public class EmployeesModel {
    Integer id;
    String employee_name;
    Integer employee_salary;
    Integer employee_age;
    String profile_image;
}
