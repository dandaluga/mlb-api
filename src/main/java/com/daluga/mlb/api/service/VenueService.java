package com.daluga.mlb.api.service;

import com.daluga.mlb.api.constants.MLBAPIEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VenueService {
    private static final Logger LOGGER = LoggerFactory.getLogger(VenueService.class);

    private RestTemplate restTemplate;

    public VenueService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findAllVenues() {
        LOGGER.debug("The findAllVenues has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.VENUES.endPoint(), String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findAllVenues has ended!");
    }

    public void findVenueById(Integer id) {
        LOGGER.debug("The findVenueById has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.VENUES.endPoint() + "/" + id, String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findVenueById has ended!");
    }
}
