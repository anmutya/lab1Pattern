/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1part2;

import java.util.List;


/**
 *
 * @author annamutovkina
 */
public class Lab1part2 {

    public static void main(String[] args) {
        FileLoader fileLastName = new FileLoader("/Users/annamutovkina/Downloads/LastNameForLab.csv");
        List listWithName = fileLastName.loadFile();
        FileLoader fileName = new FileLoader("/Users/annamutovkina/Downloads/NamesForLab.csv");
        fileName.loadFile();
    }

}