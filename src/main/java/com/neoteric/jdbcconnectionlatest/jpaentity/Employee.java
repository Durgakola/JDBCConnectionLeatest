package com.neoteric.jdbcconnectionlatest.jpaentity;



import jakarta.persistence.*;
    @Entity
    @Table(name = "employee", schema = "sonar")
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming auto-generation for id
        private int id;

        @Column(name = "name", nullable = false)
        private String name;

        @Column(name = "dept")
        private String dept;

        @Column(name = "salary")
        private double salary;

        @Column(name = "state")
        private String state;

        @ManyToOne
        @JoinColumn(name = "pid", referencedColumnName = "id")
        private Project projectEntity;

        @Column(name = "mid")
        private int mid;

        // Default constructor
        public Employee() {
        }

        // Getters and setters
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

        public Project getProjectEntity() {
            return projectEntity;
        }

        public void setProjectEntity(Project projectEntity) {
            this.projectEntity = projectEntity;
        }

        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        @Override
        public String toString() {
            return "EmployeeEntity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    ", salary=" + salary +
                    ", state='" + state + '\'' +
                    ", projectEntity=" + (projectEntity != null ? projectEntity.getName() : "null") +
                    ", mid=" + mid +
                    '}';
        }
    }

