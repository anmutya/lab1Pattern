/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;

/**
 *
 * @author annamutovkina
 */
public abstract class Books {
    protected Language language;

    protected String name;
    protected Language getLanguage(){
        return language;
    }
    public String getName(){
        return this.name;
    }
    public String getInfo(){
        return this.name;
    } 
}

