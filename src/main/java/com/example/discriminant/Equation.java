package com.example.discriminant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private Double a;
    private Double b;
    private Double c;

    private String result;

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public String calculateRootsOfEquation() {
        Double d = Math.pow(getB(), 2) - 4 * getA() * getC();
        if (d > 0) {
            Double x1 = (-1 * b + Math.sqrt(d)) / 2 * getA();
            Double x2 = (-1 * b - Math.sqrt(d)) / 2 * getA();
            this.result = "Roots of equation: " + x1 + " and " + x2;
        }
        if (d == 0) {
            Double x = (-1 * b) / (2 * a);
            this.result = "Root of equation " + x;
        }
        if (d < 0) {
            this.result = "Equation doesn't have roots!";
        }
        return this.result;
    }

}
