package com.example.listscourse;

import java.util.ArrayList;

public class Teacher {
    //POJO class like struct in c++ pojo=plain old java objects
    String instructor;
    String course;

    public Teacher(String instructor, String course) {
        this.instructor = instructor;
        this.course = course;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getCourse() {
        return course;
    }
    public static ArrayList<Teacher> getTeacher() {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("vipin", "physics"));
        teachers.add(new Teacher("rimjhim", "android"));
        teachers.add(new Teacher("rishabh", "engineering"));
        teachers.add(new Teacher("shiristy", "english"));
        teachers.add(new Teacher("tanya", "web"));
        teachers.add(new Teacher("vipin", "physics"));
        teachers.add(new Teacher("rimjhim", "android"));
        teachers.add(new Teacher("rishabh", "engineering"));
        teachers.add(new Teacher("shiristy", "english"));
        teachers.add(new Teacher("tanya", "web"));
        teachers.add(new Teacher("vipin", "physics"));
        teachers.add(new Teacher("rimjhim", "android"));
        teachers.add(new Teacher("rishabh", "engineering"));
        teachers.add(new Teacher("shiristy", "english"));
        teachers.add(new Teacher("tanya", "web"));
        return teachers;
    }

}
