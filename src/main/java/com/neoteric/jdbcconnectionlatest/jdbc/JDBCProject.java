package com.neoteric.jdbcconnectionlatest.jdbc;

import java.util.Date;
import java.util.List;

public class JDBCProject {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private List<JDBCEmployee> jdbcEmployeeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<JDBCEmployee> getJdbcEmployeeList() {
        return jdbcEmployeeList;
    }

    public void setJdbcEmployeeList(List<JDBCEmployee> jdbcEmployeeList) {
        this.jdbcEmployeeList = jdbcEmployeeList;
    }

    @Override
    public String toString() {
        return "JDBCProject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", jdbcEmployeeList=" + jdbcEmployeeList +
                '}';
    }
}
