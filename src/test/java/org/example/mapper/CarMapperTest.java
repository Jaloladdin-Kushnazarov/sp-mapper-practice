package org.example.mapper;

import org.example.mapper.car.Car;
import org.example.mapper.car.CarDto;
import org.example.mapper.car.CarMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {

    @Test
    void toCarDto() {
        CarMapper carMapper = Mappers.getMapper(CarMapper.class);
        Car car = new Car("1", "Malibu", "GM", 1200.0);
        CarDto carDto = carMapper.toCarDto(car);
        System.out.println(carDto);
    }
}