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
public class PlayerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerService.class);

    private RestTemplate restTemplate;

    public PlayerService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findPlayerById(Long id) {
        LOGGER.debug("The findPlayerById has started!");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.PEOPLE.endPoint() + "/" + id, String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findPlayerById has ended!");
    }

    public void findPlayersById(List<Long> ids) {
        LOGGER.debug("The findPlayersById has started!");

        String playerIds = StringUtils.join(ids, ",");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.PEOPLE.endPoint() + "?personIds=" + playerIds, String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findPlayersById has ended!");
    }
}
