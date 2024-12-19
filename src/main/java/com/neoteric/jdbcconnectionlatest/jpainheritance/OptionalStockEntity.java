package com.neoteric.jdbcconnectionlatest.jpainheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "optionalStockEntity",schema = "sonar")
public class OptionalStockEntity extends StockEntity {
    private double strickPrice;

    public double getStrickPrice() {
        return strickPrice;
    }

    public void setStrickPrice(double strickPrice) {
        this.strickPrice = strickPrice;
    }
}
