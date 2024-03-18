/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author annamutovkina
 */
public class FileLoader {
    private String pathToFile; 
    
    public FileLoader(String file){
        this.pathToFile = file;
        }
    
    public  List<String> loadFile(){
        String line = "";
        String cvsSplitBy = ","; 

        List<String> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(this.pathToFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                for (String item : data) {
                    dataList.add(item);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }
 }
  
