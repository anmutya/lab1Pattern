package Person;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author annamutovkina
 */
public abstract class PersonFactory {
    
    public abstract Person createPerson(String firstName, String lastName, String middleName, int sex);
}
