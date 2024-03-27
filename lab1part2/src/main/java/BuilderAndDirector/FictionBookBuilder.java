/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BuilderAndDirector;

import Books.FictionBooks;

/**
 *
 * @author annamutovkina
 */
public interface FictionBookBuilder {
    void buildName();
    void buildGenre();
    FictionBooks getResult();
}
