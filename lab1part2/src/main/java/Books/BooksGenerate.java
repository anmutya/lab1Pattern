/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;

import BuilderAndDirector.FileLoader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author annamutovkina
 */
public class BooksGenerate {
    private static String rusCoursePath = "res/RusCourse.csv";
    private static String engCoursePath = "res/EngCourses.csv";
    private static String namesEnglEduBooksPath = "res/EngEduNames.csv";
    private static String namesRusEduBooksPath = "res/namesRusEduBooks.csv";
    private static String engGenresPath = "res/EngGenres.csv";
    private static String RusGenresPath = "res/RusGenres.csv";
    private static String namesEngFictionBooksPath = "res/NamesEngFictionBooks.csv";
    private static String namesRusFictionBooksPath = "res/NamesRusFictionBooks.csv";
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
           name = FileLoader.loadFileToList(namesEngFictionBooksPath).get(rd.nextInt(FileLoader.loadFileToList(namesEngFictionBooksPath).size()));
        }
        else{
            name = FileLoader.loadFileToList(namesRusFictionBooksPath).get(rd.nextInt(FileLoader.loadFileToList(namesRusFictionBooksPath).size()));
        }return name;
    }
    public String generateGenre(Language language){
        Random rd = new Random();
        String genre;
        if(language.equals(Language.ENGLISH)){
           genre = FileLoader.loadFileToList(engGenresPath).get(rd.nextInt(FileLoader.loadFileToList(engGenresPath).size()));
        }
        else{
            genre = FileLoader.loadFileToList(RusGenresPath).get(rd.nextInt(FileLoader.loadFileToList(RusGenresPath).size()));
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
           name = FileLoader.loadFileToList(namesEnglEduBooksPath).get(rd.nextInt(FileLoader.loadFileToList(namesEnglEduBooksPath).size()));
        }
        else{
            name = FileLoader.loadFileToList(namesRusEduBooksPath).get(rd.nextInt(FileLoader.loadFileToList(namesRusEduBooksPath).size()));
        }return name;
    }
    public String generateCourse(Language lang){
        Random rd = new Random();
        String course;
        if(lang.equals(Language.ENGLISH)){
           course = FileLoader.loadFileToList(engCoursePath).get(rd.nextInt(FileLoader.loadFileToList(engCoursePath).size()));
        }
        else{
            course = FileLoader.loadFileToList(rusCoursePath).get(rd.nextInt(FileLoader.loadFileToList(rusCoursePath).size()));
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


    
            
 }




