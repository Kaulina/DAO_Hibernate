package ru.netology.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.entity.DataPerson;
import ru.netology.entity.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface CrudRepositoryPerson extends JpaRepository<Person, DataPerson> {
    List<Person> findByCityOfLiving(String cityOfLiving);
    List<Person> findPersonByDataPerson_AgeBeforeOrderByDataPersonAsc(Integer age);

    Optional<Person> findPersonByDataPerson_NameContainingIgnoreCaseAndAndDataPerson_SurnameContainingIgnoreCase
            (String name, String surname);

}