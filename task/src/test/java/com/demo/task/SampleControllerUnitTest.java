package com.demo.task;


import com.demo.task.controller.SampleController;
import com.demo.task.controller.SampleException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SampleControllerUnitTest {

    @Autowired
    SampleController sampleController;

    @Test(expected = SampleException.class)
    public void testIt() throws Exception {
        sampleController.sampleOperation("123");
    }

    @Configuration
    public static class Config {
        @Bean
        public SampleController someController() {
            return new SampleController();
        }
    }

}
