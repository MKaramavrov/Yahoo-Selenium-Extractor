package com.citi.kmc.test.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import java.util.List;

@Entity
public class FirstCollectionGrouped {
    @Id
    private String name;
    private List<FirstCollection> items;

    public FirstCollectionGrouped() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FirstCollection> getItems() {
        return items;
    }

    public void setItems(List<FirstCollection> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "FirstCollectionGrouped{"
                + "name='" + name + '\''
                + ", items=" + items
                + '}';
    }
}
