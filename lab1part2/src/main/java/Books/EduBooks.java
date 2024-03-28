/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public abstract class EduBooks {
    protected String course;
    protected Language language;
    protected String name;
    protected Language getLanguage(){
        return language;
    }
    public String getName(){
        return this.name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return this.course;
    }
    public String getInfo(){
        return this.name + " " + this.course;
    }
}
