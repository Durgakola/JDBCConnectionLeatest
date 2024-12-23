package com.neoteric.jdbcconnectionlatest.singletonpattren.diffrentconnections;

public interface ConnectionService {
     NeoConnectionService getConnection(String url, String userName, String password);
}
