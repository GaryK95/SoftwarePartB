/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softengpartb;


import com.mycompany.mavenproject1.*;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;



/**
 *
 * @author 14493172
 */
public class Main {
    
    public static void main(String args[]){
        List<Module> comSci = new ArrayList<>();
        List<Student> students = new ArrayList<>();


        Student Gary = new Student("Gary Kelly", 23, "1995-09-08", 14493172, comSci);
        Student Kevin  = new Student("Kevin Farrell", 22, "1996-04-11", 14584793, comSci);
        Student Brian   = new Student("Brian Collins", 24, "1994-04-11", 143841323, comSci);
        
        students.add(Gary);
        students.add(Kevin);
        students.add(Brian);
        
        Module softEng = new Module("Software Engineering","CT417", students); 
        Module artInt = new Module("Artificial Intelligence","CT421", students); 
        Module macLea = new Module("Machine Learning","CT475", students); 
        
        comSci.add(softEng);
        comSci.add(artInt);
        comSci.add(macLea);
        
        LocalDate start = new LocalDate(2015,9,01);
        LocalDate end = new LocalDate(2019,6,30);
        Course computerScience = new Course("Computer Science",start, end, comSci);
        
        System.out.println(computerScience.getName());
        for(Module module: comSci){
            System.out.println(module.getName());
            for(Student student: students){
                System.out.println(student.getName());
            }
            System.out.println();
        }
    }
    
    
}
