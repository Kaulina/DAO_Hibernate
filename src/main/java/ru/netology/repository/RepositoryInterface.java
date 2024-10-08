package ru.netology.repository;

import ru.netology.entity.Person;

import java.util.List;

public interface RepositoryInterface {
    List<Person> getPersonsByCity(String city);
    List<String> getPersonsNameByCity(String city);
}
