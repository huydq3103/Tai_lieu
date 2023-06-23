package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponObject {

    private String status;
    private String messsage;
    private Object data;

    public ResponObject() {
    }

}
