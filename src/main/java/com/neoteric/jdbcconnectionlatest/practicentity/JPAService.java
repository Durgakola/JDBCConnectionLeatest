package com.neoteric.jdbcconnectionlatest.practicentity;

import com.neoteric.jdbcconnectionlatest.jpa.entity.ProjectEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


import java.util.ArrayList;
import java.util.List;




public class JPAService {

   public void saveJpa(Project project){
       EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
        ProjectOneToManyEntity projectEntity = new ProjectOneToManyEntity();

        projectEntity.setName(project.getName());
        projectEntity.setStartDate(project.getStartDate());
        projectEntity.setEndDate(project.getEndDate());

        List<EmployeeOneManyEntity> employeeEntityList =new ArrayList<>();

        for(int i=0; i<project.getEmployeeList().size();i++){
            Employee emp=project.getEmployeeList().get(i);
            EmployeeOneManyEntity employeeEntity =new EmployeeOneManyEntity();
            employeeEntity.setName(emp.getName());
            employeeEntity.setDept(emp.getDept());
            employeeEntity.setState(emp.getState());
            employeeEntity.setSalary(emp.getSalary());
            employeeEntity.setProjectEntity(projectEntity);

            employeeEntityList.add(employeeEntity);
        }
        projectEntity.setEmployeeEntityList(employeeEntityList);
        entityManager.persist(projectEntity);
        entityManager.getTransaction().commit();

    }
    public List<ProjectOneToManyEntity> getEmpProjectMap(){
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("neoteric");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        //select * from sonar.Project p inner join  sonar.Employee e on p.id=e.pid
        entityManager.getTransaction().begin();


        Query query=entityManager.createQuery("select p from ProjectOneToManyEntity p inner join p.employeeOneManyEntity e where p.id=e.pid ",ProjectOneToManyEntity.class);

        List<ProjectOneToManyEntity> projectEntities=query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;
    }
}
