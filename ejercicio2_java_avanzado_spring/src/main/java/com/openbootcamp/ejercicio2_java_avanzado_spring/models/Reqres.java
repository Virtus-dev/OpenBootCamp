package com.openbootcamp.ejercicio2_java_avanzado_spring.models;

public class Reqres {
    private String first_name;
    private int id;

    public Reqres(){}
    public Reqres(String name, int id)
    {
        first_name = name;
        this.id = id;
    }

    public String getName() {
        return first_name;
    }

    public void setName(String name) {
        this.first_name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
