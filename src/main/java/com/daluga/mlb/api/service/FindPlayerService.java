package com.daluga.mlb.api.service;

import com.daluga.mlb.api.MlbApiApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FindPlayerService {
    private static final String BASE_URL = "http://statsapi.mlb.com/api/v1/people/";

    private static final Logger LOGGER = LoggerFactory.getLogger(FindPlayerService.class);

    private RestTemplate restTemplate;

    public FindPlayerService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findPlayerById(long id) {
        LOGGER.debug("The findPlayerById has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + "/" + id, String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findPlayerById has ended!");
    }
}
