package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
       //prototype
        Course course1 = container.getBean("java", Course.class);
        Course course2 = container.getBean("java", Course.class);
        System.out.println("Pointing to the same object: "+ (course1==course2));
        System.out.println("Memory Location for the course1: "+course1);
        System.out.println("Memory Location for the course2: "+course2);

        //singleton
        Course course3 = container.getBean("selenium", Course.class);
        Course course4 = container.getBean("selenium", Course.class);
        System.out.println("Pointing to the same object: "+ (course3==course4));
        System.out.println("Memory Location for the course3: "+course3);
        System.out.println("Memory Location for the course4: "+course4);

    }
}
