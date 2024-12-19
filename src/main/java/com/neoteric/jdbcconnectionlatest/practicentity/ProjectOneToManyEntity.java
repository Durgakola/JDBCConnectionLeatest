package com.neoteric.jdbcconnectionlatest.practicentity;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
    @Table(name = "project_latest_jpa", schema = "sonar")
    public class ProjectOneToManyEntity {

        public ProjectOneToManyEntity(){
            // Default constructor required by JPA
        }


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "pname")
        private String name;

        @Column(name = "startdate")
        private Date startDate;

        @Column(name = "enddate")
        private Date endDate;


        @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL,
                fetch = FetchType.EAGER)
        private List<EmployeeOneManyEntity> employeeEntityList;

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



        public List<EmployeeOneManyEntity> getEmployeeEntityList() {
            return employeeEntityList;
        }

        public void setEmployeeEntityList(List<EmployeeOneManyEntity> employeeEntityList) {
            this.employeeEntityList = employeeEntityList;
        }

        @Override
        public String toString() {
            return "ProjectEntity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", startDate=" + startDate +
                    ", endDate=" + endDate +
                    '}';
        }
    }
