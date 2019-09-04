package com.daluga.mlb.api.constants;

public enum Teams {
    CHICAGO_CUBS(112),
    CINCINNATI_REDS(113),
    MILWAUKEE_BREWERS(158),
    PITTSBURGH_PIRATES(134),
    ST_LOUIS_CARDINALS(138);

    private Integer id;

    Teams(Integer id) {
        this.id = id;
    }

    public Integer id() {
        return id;
    }
}
