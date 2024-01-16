package com.question4.Question4.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cources {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int c_id;
    String course_name;

}
