package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        //prototype
        Course course = container.getBean("java", Course.class);
        Course course2 = container.getBean("selenium", Course.class);
        course.getTeachingHours();
        course2.getTeachingHours();



    }
}
