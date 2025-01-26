package com.luv2code.springboot.demo.mycollaapp.Restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController 

public class FunRestcontroller {
    @GetMapping("/")
    public String sayhello(){
        return "Hello world !";
    }

    @Value("${coach.name}")
    private String coachName ;

    @Value ("${team.name}")
    private String teamName ;


@GetMapping("/teaminfo")
public String getinfo(){
<<<<<<< HEAD
    return  "coach name is test 2 3 4 5 55 testing " + coachName +" team name is "+ teamName;
=======
    return  "coach name is tested 26/1 " + coachName +" team name is "+ teamName;
>>>>>>> 7fd00f347eac2e50241f6afba431ea1aa9074284
    }


    @GetMapping("/workout")
    public String dailyworkout(){
        return "you daily work put is done";
    }
}
