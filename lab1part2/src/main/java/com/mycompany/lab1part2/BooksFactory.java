/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.lab1part2;

/**
 *
 * @author annamutovkina
 */
public interface BooksFactory {
    EduBooks createEduBooks(String language);
    FictionBooks createFicBooks(String language);
}
