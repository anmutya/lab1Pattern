/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import Gui.GuiTree;

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