package com.example.discriminant.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String result;
    private Double a;
    private Double b;
    private Double c;

    public Equation (Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calculateRootsOfEquation(Double a, Double b, Double c) {
        Double d = Math.pow(b, 2) - 4 * a * c;
        if (d > 0) {
            Double x1 = (-1 * b + Math.sqrt(d)) / 2 * a;
            Double x2 = (-1 * b - Math.sqrt(d)) / 2 * a;
            this.result = "Roots of equation: " + Math.floor(x1) + " and " + Math.floor(x2);
        }
        if (d == 0) {
            Double x = (-1 * b) / (2 * a);
            this.result = "Root of equation " + Math.floor(x);
        }
        if (d < 0) {
            this.result = "Equation doesn't have roots!";
        }
        return this.result;
    }

}
