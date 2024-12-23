package com.neoteric.jdbcconnectionlatest.singletonpattren.diffrentconnections;

import org.springframework.stereotype.Service;

@Service
public class OracleConnectionService implements ConnectionService  {

    private TCPConnectionService tcpConnectionService;

    public OracleConnectionService(TCPConnectionService tcpConnectionService){
        this.tcpConnectionService=tcpConnectionService;
    }


    @Override
    public NeoConnectionService getConnection(String url, String userName, String password) {

        NeoConnectionService con=new NeoConnectionService("OracleDatabase");
        return con;

    }
}
