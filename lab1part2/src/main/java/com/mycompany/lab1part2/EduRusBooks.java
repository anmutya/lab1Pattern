/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public class EduRusBooks extends EduBooks{
    private String type;
    public EduRusBooks(String name, String course, String type){
        this.name = name;
        this.course = course;
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
}