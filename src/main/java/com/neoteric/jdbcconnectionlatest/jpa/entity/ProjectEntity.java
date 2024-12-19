package com.neoteric.jdbcconnectionlatest.jpa.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="project",schema = "sonar")
public class ProjectEntity {
    public ProjectEntity(){
        //Defult constructor required by jpa
    }
    @Id
    @Column(name="id")


    private int id;
    @Column(name="pname")
    private String name;
    @Column(name="startdate")
    private Date  startDate;
    @Column(name="enddate")
    private Date endDate;

    @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
    private List<EmployeeEntity> employeeEntityList;

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

    public List<EmployeeEntity> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntity> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", employeeEntityList=" + employeeEntityList +
                '}';
    }
}
