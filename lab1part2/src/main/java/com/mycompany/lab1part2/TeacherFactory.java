/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public class TeacherFactory extends PersonFactory{

    @Override
    public Person createPerson(String firstName, String lastName, String middleName, int sex) {
        return new Teacher(firstName, lastName, middleName, sex);
    }
    
}
