package com.demo.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/{id}")
    public void sampleOperation(@PathVariable String id) throws SampleException {
        throw new SampleException("Not good for customer " + id);
    }

}
