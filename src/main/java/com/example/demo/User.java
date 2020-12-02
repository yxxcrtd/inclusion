package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class User {

    private String id;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> list;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}
