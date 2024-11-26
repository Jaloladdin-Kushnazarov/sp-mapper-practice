package org.example.mapper.car;

import org.mapstruct.Mapper;

@Mapper
public interface CarMapper {

    CarDto toCarDto(Car car);

}
