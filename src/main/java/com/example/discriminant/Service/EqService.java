package com.example.discriminant.Service;

import com.example.discriminant.Entity.Equation;
import com.example.discriminant.repos.EqRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EqService {
    @Autowired
    private EqRepo eqRepo;

    public String calculateResult(Double a, Double b, Double c) {
        Equation equation = new Equation(a, b, c);
        equation.calculateRootsOfEquation(a, b, c);
        eqRepo.save(equation);
        return "a = " + a + " b = " + b + " c = " + c + " " + equation.calculateRootsOfEquation(a, b, c);
    }

    public Iterable<Equation> findAll() {
        return eqRepo.findAll();
    }
}
