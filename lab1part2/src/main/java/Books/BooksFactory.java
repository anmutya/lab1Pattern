/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public interface BooksFactory {
    EduBooks createEduBooks(Language language);
    FictionBooks createFicBooks(String name, String genre, Language language);
}
