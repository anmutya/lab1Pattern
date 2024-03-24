package com.mycompany.lab1part2;


import com.mycompany.lab1part2.FileLoader;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author annamutovkina
 */
public class FullNameGenerator {
    static String namesPath = "res/NamesForLab.csv";
    static String lastNamesForStudentPath = "res/LastNameForLab.csv";
    static String lastNamesForTeachersPath = "res/LastNameForTeach.csv";
    static String middleNamesPath = "res/MiddleNameForLab.csv";

    private ArrayList<String> maleNames= new ArrayList();
    private ArrayList<String> femaleNames= new ArrayList();
    private ArrayList<String> maleMiddleNames= new ArrayList();
    private ArrayList<String> femaleMiddleNames= new ArrayList();
    private ArrayList<String> femaleLastNamesTeachers= new ArrayList();
    private ArrayList<String> femaleLastNamesStudents= new ArrayList();
    private ArrayList<String> maleLastNamesTeachers= new ArrayList();
    private ArrayList<String> maleLastNamesStudents= new ArrayList();
    
    
    public FullNameGenerator(){
        parseNames();
        for (int i=0; i<5; i++){
            System.out.println(maleNames.get(i));
            System.out.println(femaleNames.get(i));
        }
    }
    
    private void parseNames(){
        var namesList = FileLoader.loadFile(namesPath);
        for (ArrayList pair : namesList){
            String name = (String) pair.get(0);
            int sex = (int) pair.get(1);
            if (sex == 1){
                maleNames.add(name);
            }else{
                femaleNames.add(name);
            }
        }
    }
    
}
