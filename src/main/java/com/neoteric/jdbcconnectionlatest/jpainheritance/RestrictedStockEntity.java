package com.neoteric.jdbcconnectionlatest.jpainheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="restrictedStockEntity",schema = "sonar")
public class RestrictedStockEntity extends StockEntity {
    private int lockInPeriod;

    public int getLockInPeriod() {
        return lockInPeriod;
    }

    public void setLockInPeriod(int lockInPeriod) {
        this.lockInPeriod = lockInPeriod;
    }
}
