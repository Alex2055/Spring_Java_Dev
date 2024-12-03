package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions= extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: " +(30+ extraSessions.getHours()));
    }


}

