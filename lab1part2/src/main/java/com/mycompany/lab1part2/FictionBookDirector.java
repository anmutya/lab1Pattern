/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public class FictionBookDirector {
    FictionBookBuilder builder;
    public FictionBookDirector(FictionBookBuilder builder){
        this.builder = builder;
    }

    public void setBuilder(FictionBookBuilder builder){
        this.builder = builder;
    }
    public void constructArtisticBook() {
        builder.setName();
        builder.setGenre();
    }
}
