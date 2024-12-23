package com.neoteric.jdbcconnectionlatest.singletonpattren.diffrentconnections;

import org.springframework.stereotype.Service;

@Service
public class MySqlConnectionService implements ConnectionService {

    private TCPConnectionService tcpConnectionService;

    public MySqlConnectionService(TCPConnectionService tcpConnectionService){
        this.tcpConnectionService=tcpConnectionService;
    }

    @Override
    public NeoConnectionService getConnection(String url, String userName, String password) {

        NeoConnectionService conn=new NeoConnectionService("MySqlConnection");
        return conn;
    }
}
