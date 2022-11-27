package com.example.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity

public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
    private double salary;
}
