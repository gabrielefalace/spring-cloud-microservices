package com.demo.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import static java.lang.String.*;

@SpringBootApplication
@EnableTask
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @Bean
    public TollProcessingTask tollProcessingTask() {
        return new TollProcessingTask();
    }


    // Need to pass params in the "program arguments"
    public class TollProcessingTask implements CommandLineRunner {
        @Override
        public void run(String... strings) throws Exception {
            if (strings != null) {
                System.out.println("Number of strings received: " + strings.length);
                String stationId = strings[0];
                String licencePlate = strings[1];
                String timestamp = strings[2];

                System.out.println(format("StationID: %s Licence Plate: %s Timestamp: %s", stationId, licencePlate, timestamp));

            }
        }
    }
}
