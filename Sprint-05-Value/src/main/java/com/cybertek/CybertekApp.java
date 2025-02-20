package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        //prototype
        Course course = container.getBean("java", Course.class);
        System.out.println(course.toString());



        ((ClassPathXmlApplicationContext)container).close();
    }

}
