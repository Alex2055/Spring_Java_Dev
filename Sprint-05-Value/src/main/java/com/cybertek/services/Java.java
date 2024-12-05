package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class Java implements Course {
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

    //@Autowired
//@Qualifier("mockInterviewHours")
    private ExtraSessions extraSessions;


    public Java(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: "+(20 + extraSessions.getHours()))
    ;}

@PostConstruct
    public void postConstruct() {
    System.out.println("Executing Post Construct");
}
    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing Pre Destroy");
}
}

