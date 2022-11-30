package org.sfp.day1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
        Student student = (Student) context.getBean("Student");
        student.listStudentInformation();

    }
}