package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        return insertPerson(UUID.randomUUID(), person);
    }

    List<Person> selectAllPersons();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
