package com.codewithmosh.store.entities;

import lombok.*;

@Getter
@Data
@Setter
public class Error {
    private String message;
    private String status;

    public Error(String message, String status) {
        this.message = message;
        this.status = status;
        System.out.println("Error: " + this);
    }

   

        
}
