package com.example.demo.entity;

import java.util.List;

public class CountList<T> {
    int total;
    List<T> records;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public CountList(int total, List<T> records) {
        this.total = total;
        this.records = records;
    }
}
