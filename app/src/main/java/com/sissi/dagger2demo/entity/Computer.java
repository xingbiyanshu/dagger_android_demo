package com.sissi.dagger2demo.entity;

import javax.inject.Inject;

public class Computer {
    String brand;
    String model;

    @Inject // dagger可使用该构造（从而为需求者注入对象）
    public Computer() {
        brand = "dell";
        model = "7010";
    }

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
