/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab1part2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annamutovkina
 */
public class Lab1part2 {

    public static void main(String[] args) {
        PersonGenerator gen = new PersonGenerator();
        ArrayList<Person> person = new ArrayList();
        person.addAll(gen.generateStudents(30));
        person.addAll( gen.generateTeacher(20));
        for(Person st : person){
            System.out.println(st.toString());
        }
    }

}
