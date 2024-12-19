package com.neoteric.jdbcconnectionlatest.jdbc;

import java.util.List;

public class JDBCEmployee {
    private int id;
    private String name;
    private String dept;
    private double salary;
    private String state;
    private int mid;
    private int pid;
    private List<JDBCEmployee> jdbcEmployeeList;

    public List<JDBCEmployee> getJdbcEmployeeList() {
        return jdbcEmployeeList;
    }

    public void setJdbcEmployeeList(List<JDBCEmployee> jdbcEmployeeList) {
        this.jdbcEmployeeList = jdbcEmployeeList;
    }

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "JDBCEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", state='" + state + '\'' +
                ", mid=" + mid +
                ", pid=" + pid +
                '}';
    }
}
