/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderAndDirector;

import Books.BooksGenerate;
import Books.FictionBookFactory;
import Books.FictionBooks;
import Books.Language;

/**
 *
 * @author annamutovkina
 */
public abstract class FictionBookBuilderFix {
    protected String name;
    protected String genre;
    protected Language language;
    protected BooksGenerate gen = new BooksGenerate();
    
    public FictionBookBuilderFix(){
        this.language = language;
    }
    public void buildName() {
       this.name = gen.generateNameForFictionBooks(this.language);
    }


    public void buildGenre() {
        this.genre = gen.generateGenre(this.language);
    }

    public FictionBooks getResult() {
        return new FictionBookFactory().createFicBooks(this.name, this.genre, this.language);
    }
}
