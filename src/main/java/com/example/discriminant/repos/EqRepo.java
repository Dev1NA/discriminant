package com.example.discriminant.repos;

import com.example.discriminant.Entity.Equation;
import org.springframework.data.repository.CrudRepository;

public interface EqRepo extends CrudRepository<Equation, Integer> {
}
