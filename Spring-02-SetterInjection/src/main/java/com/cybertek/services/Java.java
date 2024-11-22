package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {
    public void setExtraSessions(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    private ExtraSessions extraSessions;

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " +(20+ extraSessions.getHours()));
    }
}
