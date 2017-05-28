package com.demo.taskintake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskProcessor t;

    @PostMapping("/tasks")
    public String launchTask(@RequestBody String s) {
        t.publishRequest(s);
        System.out.print("request made");
        return "success";
    }

}
