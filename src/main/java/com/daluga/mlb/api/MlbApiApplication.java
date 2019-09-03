package com.daluga.mlb.api;

import com.daluga.mlb.api.service.FindPlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;

@SpringBootApplication
public class MlbApiApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(MlbApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MlbApiApplication.class, args);
    }

    @Autowired
    private FindPlayerService findPlayerService;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.debug("The MlbApiApplication has started!");

        LOGGER.debug("Number of processors: " + Runtime.getRuntime().availableProcessors());

        findPlayerService.findPlayerById(446372L);

        LOGGER.debug("The MlbApiApplication has ended!");
    }
}
