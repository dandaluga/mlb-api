package com.daluga.mlb.api.constants;

public enum Venues {
    WRIGLEY_FIELD(17);

    private Integer id;

    Venues(Integer id) {
        this.id = id;
    }

    public Integer id() {
        return id;
    }
}
