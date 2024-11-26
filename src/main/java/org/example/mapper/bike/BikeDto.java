package org.example.mapper.bike;

import lombok.AllArgsConstructor;
import lombok.ToString;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BikeDto {
    private String bikeName;
    private double bikePrice;
}
