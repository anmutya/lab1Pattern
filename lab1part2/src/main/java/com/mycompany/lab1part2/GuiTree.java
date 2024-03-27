/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1part2;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author annamutovkina
 */
public class GuiTree extends JFrame {

    private JTree tree;
    private DefaultMutableTreeNode rootTree;
    private DefaultMutableTreeNode students;
    private DefaultMutableTreeNode teachers;
    private JScrollPane scroll;
    private Random rand;

    public GuiTree(String name, ArrayList<Person> people, ArrayList<Books> books) {
        super(name);
        rand = new Random();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.rootTree = new DefaultMutableTreeNode("Пользователи");
        this.tree = new JTree(rootTree);
        this.students = new DefaultMutableTreeNode("Студенты");
        this.teachers = new DefaultMutableTreeNode("Преподаватели");
        this.scroll = new JScrollPane(tree);
        rootTree.add(teachers);
        rootTree.add(students);
        initHumanNodes(people, books);
        this.add(scroll);
    }
    
    private void initHumanNodes(ArrayList<Person> people,ArrayList<Books> books) {
        DefaultMutableTreeNode varNode;

        for (Person p : people) {
            varNode = new DefaultMutableTreeNode(p.toString());
            if (p instanceof Teacher) {
                teachers.add(varNode);
            } else {
                students.add(varNode);
            }
            initBookNodes(varNode, books);
        }
    }

    private void initBookNodes(DefaultMutableTreeNode parent, ArrayList<Books> books) {
        ArrayList<Books> copy = new ArrayList<>(books);
        Collections.shuffle(copy);
        DefaultMutableTreeNode varNode;

        for (Books b : copy.subList(0, rand.nextInt(3, 10))) {
            varNode = new DefaultMutableTreeNode(b.getInfo());
            parent.add(varNode);
        }
    }

}
