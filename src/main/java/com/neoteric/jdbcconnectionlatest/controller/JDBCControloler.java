package com.neoteric.jdbcconnectionlatest.controller;

import com.neoteric.jdbcconnectionlatest.jdbc.JDBCProject;
import com.neoteric.jdbcconnectionlatest.jdbc.JdbcConnection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.util.List;
@RestController
public class JDBCControloler {

    @GetMapping("/jdbc")
    public List<JDBCProject> getProjects(){

        return null;
    }


}
