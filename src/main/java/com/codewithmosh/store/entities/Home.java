package com.codewithmosh.store.entities;

import lombok.*;




@Setter
@Data
@Getter
public class Home {
    
private String name;
private String address;
private String city;

public Home(String name, String address, String city) {
    this.name = name;
    this.address = address;
    this.city = city;
}

}
