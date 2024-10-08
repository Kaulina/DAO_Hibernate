package ru.netology.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Person {
    @EmbeddedId
    private DataPerson dataPerson;
    @Column(nullable = false)
    private String phone_number;
    @Column(nullable = false, length = 200)
    private String city_of_living;
}