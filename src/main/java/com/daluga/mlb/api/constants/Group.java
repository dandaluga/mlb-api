package com.daluga.mlb.api.constants;

public enum Group {
    HITTING("hitting"),
    PITCHING("pitching");

    private String id;

    Group(String id) {
        this.id = id;
    }

    public String id() {
        return id;
    }
}
