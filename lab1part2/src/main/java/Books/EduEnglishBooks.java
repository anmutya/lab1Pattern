/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public class EduEnglishBooks extends EduBooks{
    private String university;
    private String author;
    private String level;
    public EduEnglishBooks(String name, String university, String author, String level, String course){
        this.name = name;
        this.university = university;
        this.author = author;
        this.level = level;
        this.course = course;
    }
    public String getUnivers(){
        return this.university;
    }
 
    public String getAuthor(){
        return this.author;
    }
   
    public String getLevel(){
        return this.level;
    }
    @Override
    public String getInfo(){
        return "Название: " + this.name +  " Автор:  " + this.author+ " Курс: "+ this.course + " Уровень: "+ this.level + " Университет: " + this.university;
    }
}
