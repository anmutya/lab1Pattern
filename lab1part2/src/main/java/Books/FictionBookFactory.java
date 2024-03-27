/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public class FictionBookFactory implements BooksFactory{

    @Override
    public EduBooks createEduBooks(Language language) {
        return null;
    }

    @Override
    public FictionBooks createFicBooks(String name, String genre, Language language) {
        if (language.equals(Language.ENGLISH)) {
            return new FictionEnBooks(name, genre, language);
        } else {
            return new FictionRusBooks(name, genre, language);
        }
    }
}
