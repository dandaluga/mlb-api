package com.daluga.mlb.api.service;

import com.daluga.mlb.api.constants.MLBAPIEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BoxscoreService {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoxscoreService.class);

    private RestTemplate restTemplate;

    public BoxscoreService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findBoxscoreById(Long id) {
        LOGGER.debug("The findBoxscoreById has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.GAME.endPoint() + "/" + id + "/boxscore", String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findBoxscoreById has ended!");
    }
}
