package com.neoteric.jdbcconnectionlatest.singletonpattren.diffrentconnections;

import org.springframework.stereotype.Service;

@Service
public class NeoConnectionService {

private String database;
    public NeoConnectionService(String database) {
        this.database=database;
    }
}
