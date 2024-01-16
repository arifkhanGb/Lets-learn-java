package com.question4.Question4.Entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;
    @OneToMany(mappedBy = "Cource")
    Cources cource;
}
