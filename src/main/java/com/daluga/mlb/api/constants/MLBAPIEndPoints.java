package com.daluga.mlb.api.constants;

public enum MLBAPIEndPoints {
    PEOPLE(MLB_API_BASE.BASE_URL + "people"),
    TEAMS(MLB_API_BASE.BASE_URL + "teams"),
    VENUES(MLB_API_BASE.BASE_URL + "venues");

    private static class MLB_API_BASE {
        private static final String BASE_URL = "http://statsapi.mlb.com/api/v1/";
    }

    private String endPoint;

    MLBAPIEndPoints(String endPoint) {
        this.endPoint = endPoint;
    }

    public String endPoint() {
        return endPoint;
    }
}
