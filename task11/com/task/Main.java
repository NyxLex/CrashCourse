package com.task;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();


        students.add(new Student("Yura",1));
        students.add(new Student("Vlad",2));
        students.add(new Student("Katya",3));
        students.add(new Student("Serhii",1));
        students.add(new Student("Nastya",2));

        Iterator iterator = students.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");

        }
    }
}
