package ru.netology;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.entity.DataPerson;
import ru.netology.entity.Person;

@SpringBootApplication
public class DaoHibernateApplication implements CommandLineRunner {
    @PersistenceContext
    private EntityManager entityManager;

    public static void main(String[] args) {
        SpringApplication.run(DaoHibernateApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Person masha = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Masha")
                        .surname("Ivanova")
                        .age(23)
                        .build())
                .phone_number("123456789")
                .city_of_living("Moscow")
                .build();
        entityManager.persist(masha);

        Person ivan = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Ivan")
                        .surname("Petrov")
                        .age(30)
                        .build())
                .phone_number("11111111111")
                .city_of_living("Moscow")
                .build();
        entityManager.persist(ivan);

        Person oleg = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Oleg")
                        .surname("Sidorov")
                        .age(40)
                        .build())
                .phone_number("222222222222")
                .city_of_living("Novosibirsk")
                .build();
        entityManager.persist(oleg);

        Person petay = Person.builder()
                .dataPerson(DataPerson.builder()
                        .name("Petay")
                        .surname("Podushkin")
                        .age(22)
                        .build())
                .phone_number("987654321")
                .city_of_living("Saratov")
                .build();
        entityManager.persist(petay);
    }
}