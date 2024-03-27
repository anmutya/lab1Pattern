/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderAndDirector;

import Books.FictionBookFactory;
import Books.Language;
import Books.FictionBooks;
import Books.BooksGenerate;

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
    public void buildName() {
       this.name = gen.generateNameForFictionBooks(this.language);
    }

    @Override
    public void buildGenre() {
        this.genre = gen.generateGenre(this.language);
    }

    @Override
    public FictionBooks getResult() {
        return new FictionBookFactory().createFicBooks(this.name, this.genre, this.language);
    }
}
