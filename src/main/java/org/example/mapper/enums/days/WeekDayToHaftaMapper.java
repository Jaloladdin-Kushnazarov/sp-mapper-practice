package org.example.mapper.enums.days;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ValueMapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WeekDayToHaftaMapper {

    WeekDayToHaftaMapper WEEK_DAY_TO_HAFTA_MAPPER = Mappers.getMapper(WeekDayToHaftaMapper.class);

    @ValueMapping(target = "MONDAY", source = "DUSHANBA")
    @ValueMapping(target = "TUESDAY", source = "SESHANBA")
    @ValueMapping(target = "WEDNESDAY", source = "CHORSHANBA")
    WeekDays from(HaftaKunlari kunlari);


    @InheritInverseConfiguration
    HaftaKunlari to(WeekDays weekDays);
}
