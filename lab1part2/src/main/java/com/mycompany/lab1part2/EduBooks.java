/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public abstract class EduBooks {
    protected String name;
    protected String course;
    public void setName(String name){
        this.name = name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return this.course;
    }
    public String getName(){
        return this.name;
    }
}
