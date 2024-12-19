package com.neoteric.jdbcconnectionlatest.jdbcdemo;

public class Employee {
        private int id;
        private String name;
        private String dept;
        private double salary;
        private String state;
        private int mid;
        private int pid;

    public Employee(int id, String name, String dept, double salary, String state, int mid, int pid) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.state = state;
        this.mid = mid;
        this.pid = pid;
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
    }

