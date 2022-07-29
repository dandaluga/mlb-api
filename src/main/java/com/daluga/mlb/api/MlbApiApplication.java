package com.daluga.mlb.api;

import com.daluga.mlb.api.constants.Group;
import com.daluga.mlb.api.constants.Year;
import com.daluga.mlb.api.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MlbApiApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(MlbApiApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MlbApiApplication.class, args);
    }

    @Autowired
    private PlayerService playerService;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.debug("The MlbApiApplication has started!");

        LOGGER.debug("Number of processors: " + Runtime.getRuntime().availableProcessors());

        //playerService.findPlayerById(446372L);
        //playerService.findPlayersById(Arrays.asList(400284L,405395L,407812L,407822L));
        playerService.findPlayerStatsById(446372L, Year.YEAR_2019, Group.PITCHING);

        //teamService.findAllTeams();
        //teamService.findTeamById(Teams.CHICAGO_CUBS.id());

        //venueService.findAllVenues();
        //venueService.findVenueById(Venues.WRIGLEY_FIELD.id());

        //rosterService.findRosterByTeamId(Teams.CHICAGO_CUBS.id());
        //rosterService.findDepthChartByTeamId(Teams.CHICAGO_CUBS.id());

        //scheduleService.findScheduleByDate(new Date());

        //boxscoreService.findBoxscoreById(565194L);

        // TODO: Call the schedule endpoint to get all the games for that day. This will return the PK of the game.
        //       Then call the boxscore service with each of the PK ids returned to get all the boxscores for the day.
        //       See this for some of the endpoints: https://github.com/bradleyhurley/PyBall/wiki/Implemented-Endpoints

        LOGGER.debug("The MlbApiApplication has ended!");
    }
}
