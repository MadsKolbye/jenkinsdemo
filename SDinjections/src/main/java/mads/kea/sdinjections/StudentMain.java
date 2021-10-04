package mads.kea.sdinjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student = context.getBean("student", Student.class);
        Student studentx = context.getBean("student2", Student.class);

        student.studentPrint();
        studentx.studentPrint();
    }
}
