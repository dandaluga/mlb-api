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

//108	LAA	Angels
//109	ARI	D-backs
//110	BAL	Orioles
//111	BOS Red Sox
//112	CHC Cubs
//113	CIN	Reds
//114	CLE	Indians
//115	COL	Rockies
//116	DET	Tigers
//117	HOU Astros
//118	KC	Royals
//119	LAD	Dodgers
//120	WSH Nationals
//121	NYM Mets
//133	OAK Athletics
//134	PIT	Pirates
//135	SD	Padres
//136	SEA	Mariners
//137	SF	Giants
//138	STL	Cardinals
//139	TB	Rays
//140	TEX	Rangers
//141	TOR	Blue Jays
//142	MIN Twins
//143	PHI	Phillies
//144	ATL	Braves
//145	CWS White Sox
//146	MIA	Marlins
//147	NYY	Yankees
//158	MIL	Brewers
}
