package com.mycompany.lab1part2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author annamutovkina
 */
public class Teacher extends Person{
        private String middleName;
        public Teacher(String firstName, String lastName, String middleName, int sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "firstName=" + this.firstName + "; "
                + "lastName=" + this.lastName + "; "
                + "middleName=" + this.middleName + "; "
                + "sex=" + this.sex;
    }
}
