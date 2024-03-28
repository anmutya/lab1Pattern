
import Books.EduBooks;
import Books.EduBooksFactory;
import Books.EduEnglishBooks;
import Books.EduRusBooks;
import Books.FictionBooks;
import Books.Language;
import BuilderAndDirector.ENGFictionBuilder;
import BuilderAndDirector.FictionBookDirector;
import BuilderAndDirector.RUFictionBuilder;
import Person.Person;
import Person.PersonGenerator;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author annamutovkina
 */
public class GeneratorAllList {
        public ArrayList generateBooksList(){
        ArrayList<EduBooks> eduBooksList= new ArrayList();
        ArrayList<FictionBooks> fictionBooksList= new ArrayList();
        ArrayList books = new ArrayList();
        EduBooksFactory fact = new EduBooksFactory();
        FictionBookDirector director = new FictionBookDirector(new RUFictionBuilder());
        FictionBookDirector director2 = new FictionBookDirector(new ENGFictionBuilder());
        for(int i = 0;i<30; i++){
            EduRusBooks eduRus = (EduRusBooks) fact.createEduBooks(Language.RUSSIAN);
            eduBooksList.add(eduRus);
            director.constructArtisticBook();
            FictionBooks book = director.getBuilder().getResult();
            fictionBooksList.add(book);
            
        }
        for(int i = 0;i<30; i++){
            EduEnglishBooks eduEng = (EduEnglishBooks) fact.createEduBooks(Language.ENGLISH);
            eduBooksList.add(eduEng);
            director2.constructArtisticBook();
            FictionBooks book2 = director2.getBuilder().getResult();
            fictionBooksList.add(book2);
        }
        books.addAll(eduBooksList);
        books.add(fictionBooksList);
        return books;
    }

    public ArrayList<Person> generatePersonList() {
        PersonGenerator gen = new PersonGenerator();
        ArrayList<Person> person = new ArrayList();
        person.addAll(gen.generateStudents(30));
        person.addAll(gen.generateTeacher(20));
        Collections.shuffle(person);
        return person;
    }
}
