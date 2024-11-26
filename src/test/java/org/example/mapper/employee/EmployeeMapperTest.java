package org.example.mapper.employee;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.example.mapper.employee.EmployeeMapper.EMPLOYEE_MAPPER;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeMapperTest {

    @Test
    void fromMap() {
        Map<String, String> emp = Map.of(
                "firstName", "Jaloladdin",
                "lastName", "Kushnazarov",
                "age", "20"
        );

        Employee employee = EMPLOYEE_MAPPER.fromMap(emp);
        System.out.println(employee);
    }

    @Test
    void fromMap2(){
    Map<String, Object> emp = Map.of(
                "firstName", "Jaloladdin",
                "lastName", "Kushnazarov",
                "age", 20
        );

        Employee employee = EMPLOYEE_MAPPER.fromMap2(emp);
        System.out.println(employee);
    }
}