package com.theironyard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String[] firstNames = {"Chad", "Chris", "Steven", "Josh", "Patrick", "Ryan", "Brandon", "Nick", "Erin", "Chad", "Steven", "Matt", "Alonya", "Candace", "Oliver"};
        String[] lastNames = {"Crabtree", "Sardina", "Schools", "May", "Toomes", "Kelley", "Aiton", "Nauert", "Grady", "Yates", "Boynton", "LePine", "Lafayette", "Moorer", "Queen"};
        for (int i = 0; i < 15; i++) {
            Student classMate = new Student();
            classMate.setFirstName(firstNames[i]);
            classMate.setLastName(lastNames[i]);
            classMate.setId(i);
            classMate.setGrade(1);
            students.add(classMate);
        }
        List<Teacher> teachers = new ArrayList<>();
        String[] teachFirstNames = {"Calvin", "Bubba", "Spencer"};
        String[] teachLastNames = {"Webster", "Lecheminant", "Oakes"};
        for (int i = 0; i < 3; i++) {
            Teacher instructor = new Teacher();
            instructor.setFirstName(teachFirstNames[i]);
            instructor.setLastName(teachLastNames[i]);
            instructor.setId(100 + i);
            instructor.setGrade(1);
            teachers.add(instructor);
        }

        Set<Student> set1 = new HashSet<>();
        Set<Student> set2 = new HashSet<>();
        Set<Student> set3 = new HashSet<>();

        Student[] studentArray = new Student[students.size()];
        studentArray = students.toArray(studentArray);

        for (int i = 0; i < 5; i++) {
            set1.add(studentArray[i]);
            set2.add(studentArray[i+5]);
            set3.add(studentArray[i+10]);
        }

        Map<Teacher, HashSet> classMap = new HashMap<>();

        Teacher[] teacherArray = new Teacher[teachers.size()];
        teacherArray = teachers.toArray(teacherArray);

        classMap.put(teacherArray[0], (HashSet) set1);
        classMap.put(teacherArray[1], (HashSet) set2);
        classMap.put(teacherArray[2], (HashSet) set3);




        System.out.println(" ");
        System.out.println("List of teachers");
        System.out.println("================================");
        System.out.println(classMap.keySet());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("List of students");
        System.out.println("================================");
        System.out.println(classMap.values());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("List of 5 students per 1 teacher");
        System.out.println("================================");
        System.out.println(classMap.entrySet());

    }


}

