/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import Gui.GuiTree;
import BuilderAndDirector.FictionBookDirector;
import BuilderAndDirector.RUFictionBuilder;
import BuilderAndDirector.ENGFictionBuilder;
import Books.EduBooksFactory;
import Books.Language;
import Books.FictionBooks;
import Books.EduRusBooks;
import Books.EduEnglishBooks;
import Books.EduBooks;
import Person.Person;
import Person.PersonGenerator;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author annamutovkina
 */
public class Lab1part2 {

    public static void main(String[] args) {
        GeneratorAllList list = new GeneratorAllList();

        GuiTree gui = new GuiTree("App", list.generatePersonList(), list.generateBooksList());
        gui.setVisible(true);

    }
    


}