package Person;

import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author annamutovkina
 */
public class PersonGenerator {

    private static String namesPath = "res/NamesForLab.csv";
    private static String lastNamesForStudentPath = "res/LastNameForLab.csv";
    private static String lastNamesForTeachersPath = "res/LastNameForTeach.csv";
    private static String middleNamesPath = "res/MiddleNameForLab.csv";

    private final ArrayList<String> maleNames = new ArrayList();
    private final ArrayList<String> femaleNames = new ArrayList();
    private final ArrayList<String> maleMiddleNames = new ArrayList();
    private final ArrayList<String> femaleMiddleNames = new ArrayList();
    private final ArrayList<String> femaleLastNamesTeachers = new ArrayList();
    private final ArrayList<String> femaleLastNamesStudents = new ArrayList();
    private final ArrayList<String> maleLastNamesTeachers = new ArrayList();
    private final ArrayList<String> maleLastNamesStudents = new ArrayList();

    public PersonGenerator() {
        parseNames();
        parseMiddleNames();
        parseStudentLastNames();
        parseTeachersLastNames();
    }

    private void parseNames() {
        parseNamesHelper(namesPath, maleNames, femaleNames);
    }

    private void parseMiddleNames() {
        parseNamesHelper(middleNamesPath, maleMiddleNames, femaleMiddleNames);
    }

    private void parseStudentLastNames() {
        parseNamesHelper(lastNamesForStudentPath, maleLastNamesStudents, femaleLastNamesStudents);
    }

    private void parseTeachersLastNames() {
        parseNamesHelper(lastNamesForTeachersPath, maleLastNamesTeachers, femaleLastNamesTeachers);
    }

    private void parseNamesHelper(String path, ArrayList maleArray, ArrayList femaleArray) {
        var namesList = FileLoader.loadFile(path);
        for (ArrayList pair : namesList) {
            String name = (String) pair.get(0);
            int sex = (int) pair.get(1);
            if (sex == 1) {
                maleArray.add(name);
            } else {
                femaleArray.add(name);
            }
        }
    }

    public ArrayList<Person> generateStudents(int size) {
        Random rd = new Random();
        String firstName;
        String lastName;
        ArrayList firstNames;
        ArrayList lastNames;
        PersonFactory factory = new StudentFactory();

        ArrayList<Person> students = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int sex = rd.nextInt(2);
            if (sex == 1) {
                firstNames = maleNames;
                lastNames = maleLastNamesStudents;
            } else {
                firstNames = femaleNames;
                lastNames = femaleLastNamesStudents;
            }
            firstName = firstNames.get(rd.nextInt(firstNames.size())).toString();
            lastName = lastNames.get(rd.nextInt(lastNames.size())).toString();
            students.add(factory.createPerson(firstName, lastName, null, sex));
        }

        return students;
    }
    public ArrayList<Person> generateTeacher(int size) {
        Random rd = new Random();
        String firstName;
        String lastName;
        String middleName;
        ArrayList<String> firstNames;
        ArrayList<String> lastNames;
        ArrayList<String> middleNames;
        PersonFactory factory = new TeacherFactory();

        ArrayList<Person> teachers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            int sex = rd.nextInt(2);
            if (sex == 1) {
                firstNames = maleNames;
                lastNames = maleLastNamesTeachers;
                middleNames = maleMiddleNames;
                
            } else {
                firstNames = femaleNames;
                lastNames = femaleLastNamesTeachers;
                middleNames = femaleMiddleNames;
            }
            firstName = firstNames.get(rd.nextInt(firstNames.size()));
            lastName = lastNames.get(rd.nextInt(lastNames.size()));
            middleName = middleNames.get(rd.nextInt(middleNames.size()));
            
            teachers.add(factory.createPerson(firstName, lastName, middleName, sex));
        }

        return teachers;
    }
}
