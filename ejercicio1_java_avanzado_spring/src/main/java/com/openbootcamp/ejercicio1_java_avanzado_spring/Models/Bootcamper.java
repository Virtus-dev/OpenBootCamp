package com.openbootcamp.ejercicio1_java_avanzado_spring.Models;

public class Bootcamper {
    private String name;
    private int age;

    public Bootcamper(){}
    public Bootcamper(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
