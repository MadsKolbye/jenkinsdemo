package mads.kea.sdinjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student = (Student) context.getBean("student");

        System.out.println("Student info:");
        System.out.println("Name: "+student.getName());
        System.out.println("Classname: "+student.getClassName());
    }
}
