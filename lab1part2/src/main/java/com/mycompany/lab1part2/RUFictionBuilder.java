/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public class RUFictionBuilder implements FictionBookBuilder{
    private Language language = Language.RUSSIAN;
    private String name;
    private String genre;
    private BooksGenerate gen = new BooksGenerate();
    
    
    @Override
    public void setName() {
       this.name = gen.generateNameForFictionBooks(this.language);
    }

    @Override
    public void setGenre() {
        this.genre = gen.generateGenre(this.language);
    }

    @Override
    public FictionBooks getResult() {
        return new FictionBookFactory().createFicBooks(this.name, this.genre, this.language);
    }
}
