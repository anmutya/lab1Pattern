package Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author annamutovkina
 */
public class StudentFactory extends PersonFactory{

    @Override
    public Person createPerson(String firstName, String lastName, String middleName, int sex) {
        return new Student(firstName, lastName, sex);
    }
    
}
