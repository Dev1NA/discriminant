package com.example.discriminant.Service;

import com.example.discriminant.Entity.Equation;
import com.example.discriminant.repos.EqRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Service {
    @Autowired
    private EqRepo eqRepo;

    Equation equation = new Equation();

    public String calculateResult(Double a, Double b, Double c) {
        equation.calculateRootsOfEquation(a, b, c);
        eqRepo.save(equation);
        return "a = " + a + " b = " + b + " c = " + c + " " + equation.calculateRootsOfEquation(a, b, c);
    }

    public Iterable<Equation> findAll() {
        return eqRepo.findAll();
    }
}
