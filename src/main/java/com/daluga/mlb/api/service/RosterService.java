package com.daluga.mlb.api.service;

import com.daluga.mlb.api.constants.MLBAPIEndPoints;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RosterService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RosterService.class);

    private RestTemplate restTemplate;

    public RosterService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findRosterByTeamId(Integer teamId) {
        LOGGER.debug("The findRosterByTeamId has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.TEAMS.endPoint() + "/" + teamId + "/roster/", String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findRosterByTeamId has ended!");
    }

    public void findDepthChartByTeamId(Integer teamId) {
        LOGGER.debug("The findDepthChartByTeamId has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.TEAMS.endPoint() + "/" + teamId + "/roster/depthChart", String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findDepthChartByTeamId has ended!");
    }
}
