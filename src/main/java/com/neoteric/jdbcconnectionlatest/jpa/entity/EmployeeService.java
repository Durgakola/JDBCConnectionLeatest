package com.neoteric.jdbcconnectionlatest.jpa.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeService {

    public List<ProjectEntity> getEmpProjectMap() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select  p from ProjectEntity p  ", ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();

        entityManager.getTransaction().commit();


        return projectEntities;
    }

    public List<ProjectEntity> projectEmpInnerjoin() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select  p from ProjectEntity p inner join p.employeeEntityList e where p.id=e.pid", ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();

        entityManager.getTransaction().commit();

        return projectEntities;
    }

    public List<ProjectEntity> nplusOne() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select p from ProjectEntity p join fetch p.employeeEntityList ", ProjectEntity.class);
        List<ProjectEntity> projectEntities = query.getResultList();

        entityManager.getTransaction().commit();

        return projectEntities;
    }


    public static List<EmployeeEntity> getEmployeesLessSalary(double employeeSalary) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        // JPQL query with the correct parameter name
        String jpql = "select e from EmployeeEntity e where e.salary > :empSalary";

        // Create the query and set the correct parameter name
        Query query = entityManager.createQuery(jpql, EmployeeEntity.class);
        query.setParameter("empSalary", employeeSalary); // Parameter name should be "empSalary"

        List<EmployeeEntity> employees = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return employees;
    }


    public static List<EmployeeEntity> parameterizedPosition(int pid) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select e from  EmployeeEntity e where e.id = :pid ", EmployeeEntity.class);
        query.setParameter("pid", pid);
        List<EmployeeEntity> employees = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return employees;
    }


    public static List<EmployeeEntity> employeeState(int id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Query query = entityManager.createQuery("select e from  EmployeeEntity e where e.id = :id", EmployeeEntity.class);
        query.setParameter("id", id);
        List<EmployeeEntity> employees = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return employees;
    }

}
