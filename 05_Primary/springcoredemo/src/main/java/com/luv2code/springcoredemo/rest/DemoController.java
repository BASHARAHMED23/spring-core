package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    //setter injection
   /* @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }*/

    // constructor injection
    @Autowired
    public DemoController(Coach theCoach){
        myCoach=theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWork();
    }
}
