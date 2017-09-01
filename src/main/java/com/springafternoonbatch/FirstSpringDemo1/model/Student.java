package com.springafternoonbatch.FirstSpringDemo1.model;

/**
 * Created by abhi on 31/08/17.
 */
public class Student {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    Integer id;
    String name;
}
