/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author annamutovkina
 */
public class BooksGenerate {
    static String rusCoursePath = "res/RusCourse.csv";
    static String engCoursePath = "res/EngCourses.csv";
    static String namesEnglEduBooksPath = "res/EngEduNames.csv";
    static String namesRusEduBooksPath = "res/namesRusEduBooks.csv";
    static String engGenresPath = "res/EngGenres.csv";
    static String RusGenresPath = "res/RusGenres.csv";
    static String namesEngFictionBooksPath = "res/NamesEngFictionBooks.csv";
    static String namesRusFictionBooksPath = "res/NamesRusFictionBooks.csv";
    private List<String> eduEngAuthors = Arrays.asList("John Dewey",
            "Paulo Freire",
            "Howard Gardner",
            "Linda Darling-Hammond",
            "E.D. Hirsch",
            "Diane Ravitch",
            "Alfie Kohn",
            "Carol Dweck",
            "Daniel T. Willingham",
            "Sir Ken Robinson");
    private List<String> level = Arrays.asList("bachelor's degree", "master's degree");
    private List<String> university = Arrays.asList("Harvard University",
            "Stanford University",
            "Massachusetts Institute of Technology (MIT)",
            "University of California, Berkeley",
            "Yale University",
            "Princeton University",
            "University of Oxford",
            "University of Cambridge",
            "Imperial College London",
            "London School of Economics and Political Science (LSE)",
            "University College London (UCL)",
            "University of Manchester");
    private List<String> type = Arrays.asList("Учебник", "Пособие", "Задачник", "Практикум", "Лабораторный практикум");
    public String generateNameForFictionBooks(Language lang){
        Random rd = new Random();
        String name;
        if(lang.equals(Language.ENGLISH)){
           name = loadFile(namesEngFictionBooksPath).get(rd.nextInt(loadFile(namesEngFictionBooksPath).size()));
        }
        else{
            name = loadFile(namesRusFictionBooksPath).get(rd.nextInt(loadFile(namesRusFictionBooksPath).size()));
        }return name;
    }
    public String generateGenre(Language language){
        Random rd = new Random();
        String genre;
        if(language.equals(Language.ENGLISH)){
           genre = loadFile(engGenresPath).get(rd.nextInt(loadFile(engGenresPath).size()));
        }
        else{
            genre = loadFile(RusGenresPath).get(rd.nextInt(loadFile(RusGenresPath).size()));
        }return genre;
    }
    
    public String generateAuthor(){
        Random rd = new Random();
        return this.eduEngAuthors.get(rd.nextInt(this.eduEngAuthors.size()));
    }
    public String generateName(Language lang){
        Random rd = new Random();
        String name;
        if(lang.equals(Language.ENGLISH)){
           name = loadFile(namesEnglEduBooksPath).get(rd.nextInt(loadFile(namesEnglEduBooksPath).size()));
        }
        else{
            name = loadFile(namesRusEduBooksPath).get(rd.nextInt(loadFile(namesRusEduBooksPath).size()));
        }return name;
    }
    public String generateCourse(Language lang){
        Random rd = new Random();
        String course;
        if(lang.equals(Language.ENGLISH)){
           course = loadFile(engCoursePath).get(rd.nextInt(loadFile(engCoursePath).size()));
        }
        else{
            course = loadFile(rusCoursePath).get(rd.nextInt(loadFile(rusCoursePath).size()));
        }return course;
    }
    public String generateUniversuty(){
        Random rd = new Random();
        return this.university.get(rd.nextInt(this.university.size()));
    }
    
    public String generateLevel(){
        Random rd = new Random();
        return this.level.get(rd.nextInt(this.level.size()));
    }
    
    public String generateType(){
        Random rd = new Random();
        return this.type.get(rd.nextInt(this.type.size()));
    }

     public  List<String> loadFile(String path){
        String line = "";
        String cvsSplitBy = ","; 
        List<String> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                for (String item : data) {
                    dataList.add(item);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }
    
            
 }




