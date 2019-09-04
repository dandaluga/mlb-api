package com.daluga.mlb.api.constants;

public enum Year {
    YEAR_2018(2018),
    YEAR_2019(2019);

    private Integer id;

    Year(Integer id) {
        this.id = id;
    }

    public Integer id() {
        return id;
    }
}
