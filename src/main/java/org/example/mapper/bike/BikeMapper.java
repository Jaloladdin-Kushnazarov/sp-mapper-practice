package org.example.mapper.bike;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface BikeMapper {

    //Agar DTOning fieldlari Entity Fileldlari bilan bir xil bo'lmasa maping qilolmaydi va pastdagi usuldan foydlanishing kerak
    @Mapping(target = "bikeName", source = "name")
    @Mapping(target = "bikePrice", source = "price")
    BikeDto toBikeDto(Bike bike);


//    @Mapping(target = "name", source = "bikeName")
//    @Mapping(target = "price", source = "bikePrice")
    @InheritInverseConfiguration//Bu toBikeDto ning target va ssource larni teskarisiga yozib beradi va qo'lda yozish shart emas
    Bike toBike(BikeDto bikeDto);
}
