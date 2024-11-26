package org.example.mapper.enums.days;

import org.junit.jupiter.api.Test;
import org.mapstruct.Mapping;
import org.mapstruct.ValueMapping;

import static org.example.mapper.enums.days.WeekDayToHaftaMapper.WEEK_DAY_TO_HAFTA_MAPPER;
import static org.junit.jupiter.api.Assertions.*;

class WeekDayToHaftaMapperTest {

    @Test
    void from() {
        System.out.println(WEEK_DAY_TO_HAFTA_MAPPER.from(HaftaKunlari.CHORSHANBA));
    }

    @Test
    void to() {
        System.out.println(WEEK_DAY_TO_HAFTA_MAPPER.to(WeekDays.TUESDAY));
    }
}