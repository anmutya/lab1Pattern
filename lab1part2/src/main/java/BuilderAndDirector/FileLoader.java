/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderAndDirector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author annamutovkina
 */
public class FileLoader {

    public static ArrayList<ArrayList> loadFile(String path) {
        String line;
        String cvsSplitBy = ",";

        var dataList = new ArrayList<ArrayList>();

        try (var br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                var row = new ArrayList<>();
                String[] data = line.split(cvsSplitBy);
                for (String item : data) {
                    try {
                        var digit = Integer.parseInt(item);
                        row.add(digit);
                    } catch (NumberFormatException e) {
                        row.add(item);
                    }
                }
                dataList.add(row);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataList;
    }


    public static List<String> loadFileToList(String path) {
        String line = "";
        String cvsSplitBy = ",";
        List<String> dataList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
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
