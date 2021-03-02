package com.iyang.design.mvc;

/**
 * Created by Yang on 2021/3/2 22:37
 */

public class MvcMain {

    public static void main(String[] args) {

        Student student = retrieveStudentFromDatabase();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student,studentView);
        studentController.updateView();
        studentController.setStudentName("John");
        studentController.updateView();

    }

    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }

}
