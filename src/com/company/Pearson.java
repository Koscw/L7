package com.company;

import java.util.Objects;

public class Pearson {
    String name;
    Integer age;
//ctrl+enter -> generate smth

    public Pearson(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pearson pearson = (Pearson) o;
        return Objects.equals(name, pearson.name) &&
                Objects.equals(age, pearson.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
