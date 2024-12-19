package com.neoteric.jdbcconnectionlatest.jpainheritance;

import java.util.Date;

public class StockTest {
    public static void main(String[] args) {

        StockSerivice serivice = new StockSerivice();

        RestrictedStockEntity restrictedStockEntity = new RestrictedStockEntity();
        restrictedStockEntity.setPrice(100.6);
        restrictedStockEntity.setDuration(23);
        restrictedStockEntity.setLockInPeriod(12);

        OptionalStockEntity optionalStockEntity = new OptionalStockEntity();
        optionalStockEntity.setPrice(200.40);
        optionalStockEntity.setDuration(30);
        optionalStockEntity.setStrickPrice(160.56);

        FutureStocksEntity futureStocksEntity=new FutureStocksEntity();
        futureStocksEntity.setPrice(250.56);
        futureStocksEntity.setDuration(25);
        futureStocksEntity.setDeliveryDate(new Date());

        serivice.saveStock(restrictedStockEntity);
        serivice.saveStock(optionalStockEntity);
        serivice.saveStock(futureStocksEntity);



    }



}
