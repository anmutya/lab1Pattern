/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public abstract class FictionBooks extends Books{
    private String genre;
    public FictionBooks(String name, String genre, Language language){
        this.name = name;
        this.genre = genre;
        this.language = language;
    }
   public String getGenre(){
       return this.genre;
   }
   @Override
    public String getInfo(){
        return this.name + " " + this.genre;
    }
}
