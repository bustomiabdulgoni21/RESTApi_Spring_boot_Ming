package com.maven.spring.boot.update.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {
    
    @NotEmpty(message = "Name is Required")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
