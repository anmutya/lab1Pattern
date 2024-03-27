package com.mycompany.lab1part2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author annamutovkina
 */
public class Student extends Person {

    public Student(String firstName, String lastName, int sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

}
