package org.example.mapper.employee;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Map;
import java.util.Objects;


@Mapper
public interface EmployeeMapper {

    EmployeeMapper EMPLOYEE_MAPPER = Mappers.getMapper(EmployeeMapper.class);

    @MapMapping(valueTargetType = String.class, keyTargetType = String.class)
    Employee fromMap(Map<String, String> params);

    @MapMapping(valueTargetType = String.class, keyTargetType = Object.class)
    Employee fromMap2(Map<String, Object> params);

    default String fromObjectToString(Object object) {
        return String.valueOf(object);
    }
}
