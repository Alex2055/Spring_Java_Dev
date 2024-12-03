package com.cybertek;

import com.cybertek.configs.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);
        //prototype
        Course course = container.getBean("java", Course.class);
        Course course2 = container.getBean("selenium", Course.class);
        course.getTeachingHours();
        course2.getTeachingHours();
        System.out.println(course.toString());



    }
}
