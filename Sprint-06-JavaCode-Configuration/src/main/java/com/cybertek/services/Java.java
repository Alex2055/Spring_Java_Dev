package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 20");
    }

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;


    @Override
    public String toString() {
        return "Java{" +
                "days=" + Arrays.toString(days) +
                ", batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }

}

