/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;


/**
 *
 * @author annamutovkina
 */
public class EduBooksFactory implements BooksFactory {
    private BooksGenerate gen = new BooksGenerate();
    @Override
    public EduBooks createEduBooks(Language language) {
        if(language.equals(Language.ENGLISH)){
            return new EduEnglishBooks(gen.generateName(language), gen.generateUniversuty(), gen.generateAuthor(), gen.generateLevel(), gen.generateCourse(language));
        }
        else if(language.equals(Language.RUSSIAN)){
            return new EduRusBooks(gen.generateName(language), gen.generateCourse(language), gen.generateType());
        }
        return null;
    }


    @Override
    public FictionBooks createFicBooks(String name, String genre, Language language) {
        return null;
    }

}
