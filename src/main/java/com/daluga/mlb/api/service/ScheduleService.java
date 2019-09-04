package com.daluga.mlb.api.service;

import com.daluga.mlb.api.constants.MLBAPIEndPoints;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class ScheduleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleService.class);

    private RestTemplate restTemplate;

    public ScheduleService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public void findScheduleByDate(Date gameDate) {
        LOGGER.debug("The findScheduleByDate has started!");

        String theDate = DateFormatUtils.format(gameDate, "MM/dd/yyyy");

        ResponseEntity<String> response = restTemplate.getForEntity(MLBAPIEndPoints.SCHEDULE.endPoint() + "?sportId=1&date=" + theDate, String.class);

        LOGGER.debug("The response: " + response);

        LOGGER.debug("The findScheduleByDate has ended!");
    }
}
