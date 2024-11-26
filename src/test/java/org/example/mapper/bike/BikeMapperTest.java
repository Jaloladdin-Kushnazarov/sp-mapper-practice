package org.example.mapper.bike;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class BikeMapperTest {

    @Test
    void toBikeDto() {
        BikeMapper bikeMapper = Mappers.getMapper(BikeMapper.class);
        Bike bike = new Bike("2", "Ural", "UK", 1300);
        BikeDto bikeDto = bikeMapper.toBikeDto(bike);
        System.out.println(bikeDto);


        Bike bike1 = bikeMapper.toBike(bikeDto);
        System.out.println(bike1);
    }
}