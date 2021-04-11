package com.task;

import java.util.Objects;

public class Student {
    public Student(){}

    public Student(String name,int course) {
        this.name = name;
        this.course = course;
    }

    private  String name;
    private  int course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "com.task.Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
