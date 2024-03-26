/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public class EduBooksFactory implements BooksFactory {
    BooksGenerate gen = new BooksGenerate();
    @Override
    public EduBooks createEduBooks(String language) {
        if(language.equals("Eng")){
            return new EduEnglishBooks(gen.generateName(language), gen.generateUniversuty(), gen.generateAuthor(language), gen.generateLevel(), gen.generateCourse(language));
        }
        else{
            return new EduRusBooks(gen.generateName(language), gen.generateCourse(language), gen.generateType());
        }
    }

    @Override
    public FictionBooks createFicBooks(String language) {
       return null;
    }

}
