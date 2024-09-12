
package com.kgisl.sb102.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.kgisl.sb102.entity.Person;

public interface PersonRepository extends ListCrudRepository<Person, Integer> {
    
}