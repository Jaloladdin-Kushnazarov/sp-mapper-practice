package org.example.mapper.car;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String id;
    private String name;
    private String maker;
    private double price;

}
