package com.neoteric.jdbcconnectionlatest.jpainheritance;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StockSerivice {

    private EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("neoteric");

   public void saveStock(StockEntity stock){
       EntityManager entityManager=entityManagerFactory.createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.persist(stock);
       entityManager.getTransaction().commit();
       entityManager.close();
   }
   public StockEntity getStock(long id){
       EntityManager entity= entityManagerFactory.createEntityManager();
       StockEntity stock=entity.find(StockEntity.class,id);
       entity.close();
       return stock;
   }
}
