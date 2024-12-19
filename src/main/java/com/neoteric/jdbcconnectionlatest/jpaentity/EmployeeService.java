package com.neoteric.jdbcconnectionlatest.jpaentity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmployeeService {
    private static final String PERSISTENCE_UNIT_NAME = "neoteric";

    // Self-join: Find employees with the same manager
    public List<Employee> findEmployeesWithSameManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        List<Employee> employees;

        try {
            em.getTransaction().begin();
            Query query = em.createQuery(
                    "SELECT e1 FROM EmployeeEntity e1, EmployeeEntity e2 WHERE e1.mid = e2.mid AND e1.id <> e2.id",
                    Employee.class);
            employees = query.getResultList();
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }

        return employees;
    }

    // Left join: Find all projects and their employees (including projects without employees)
    public List<Project> findProjectsWithEmployeesLeftJoin() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        List<Project> projects;

        try {
            em.getTransaction().begin();
            Query query = em.createQuery(
                    "SELECT DISTINCT p FROM ProjectEntity p LEFT JOIN FETCH p.employeeEntityList", Project.class);
            projects = query.getResultList();
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }

        return projects;
    }

    // Right join: JPA does not support native right join in JPQL; use native SQL query
    public List<Object[]> findEmployeesWithProjectsRightJoin() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = emf.createEntityManager();
        List<Object[]> results;

        try {
            em.getTransaction().begin();
            Query query = em.createNativeQuery(
                    "SELECT e.name, p.pname FROM project p RIGHT JOIN employee e ON p.id = e.pid");
            results = query.getResultList();
            em.getTransaction().commit();
        } finally {
            em.close();
            emf.close();
        }

        return results;
    }
}
