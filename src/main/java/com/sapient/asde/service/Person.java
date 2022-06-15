package com.sapient.asde.service;

import lombok.*;

import java.time.LocalDate;

/*
        Create tester class for Person testing getter, setter and constructor methods
        Code coverage:  >90%
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private Long adharCard;
    private String name;
    private LocalDate birthdate;
    private String address;
    private Long mobile;



}
