package com.neoteric.jdbcconnectionlatest.singletonpattren.diffrentconnections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TCPConnectionService {

    @Autowired
    ConnectionService mysqlConnectionService;

    public TCPConnectionService(MySqlConnectionService mysqlConnectionService){
        this.mysqlConnectionService=mysqlConnectionService;
    }

    public TCPConnectionService() {

    }

    public void connection1(){
        System.out.println("from TCPConnectionService");
    }
}
