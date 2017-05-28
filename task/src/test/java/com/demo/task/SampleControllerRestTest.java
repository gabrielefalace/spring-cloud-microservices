package com.demo.task;

import com.demo.task.controller.SampleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = SampleController.class)
public class SampleControllerRestTest {

    private static final String ID = "123";

    @Autowired
    MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {

        mockMvc.perform(get("/" + ID))
                .andExpect(status().isNotFound())
                .andExpect(content().string(containsString(ID)));
    }

}
