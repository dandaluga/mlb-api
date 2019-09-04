package com.daluga.mlb.api.service;

import com.daluga.mlb.api.constants.MLBAPIEndPoints;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TeamService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamService.class);

    private RestTemplate restTemplate;

    public TeamService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findAllTeams() {
        LOGGER.debug("The findAllTeams has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.TEAMS.endPoint(), String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findAllTeams has ended!");
    }

    public void findTeamById(Integer id) {
        LOGGER.debug("The findTeamById has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.TEAMS.endPoint() + "/" + id, String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findTeamById has ended!");
    }
}
