/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public abstract class EduBooks extends Books {
    protected String course;
    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return this.course;
    }
    @Override
    public String getInfo(){
        return this.name + " " + this.course;
    }
}
