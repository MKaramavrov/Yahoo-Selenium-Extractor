package com.citi.kmc.test.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(noClassnameStored = true)
public class SecondCollection {
    @Id
    private String id;
    private String testName;
    private double stockPrice;
    private LocalDateTime testTime;

    public SecondCollection() {
    }

    public LocalDateTime getTestTime() {
        return testTime;
    }

    public void setTestTime(LocalDateTime testTime) {
        this.testTime = testTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecondCollection that = (SecondCollection) o;
        return Double.compare(that.stockPrice, stockPrice) == 0 && Objects.equals(id, that.id) && Objects.equals(testName, that.testName) && Objects.equals(testTime, that.testTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testName, stockPrice, testTime);
    }

    @Override
    public String toString() {
        return "SecondCollection{"
                + "id='" + id + '\''
                + ", testName='" + testName + '\''
                + ", stockPrice=" + stockPrice
                + ", localDateTime=" + testTime
                + '}';
    }
}