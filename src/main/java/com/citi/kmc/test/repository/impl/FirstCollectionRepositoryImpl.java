package com.citi.kmc.test.repository.impl;

import com.citi.kmc.test.model.FirstCollection;
import com.citi.kmc.test.model.FirstCollectionGrouped;
import com.citi.kmc.test.repository.FirstCollectionRepository;
import dev.morphia.Datastore;
import dev.morphia.Key;
import dev.morphia.aggregation.Group;
import java.util.Iterator;
import javax.management.Query;

public class FirstCollectionRepositoryImpl implements FirstCollectionRepository {
    private final Datastore datastore;

    public FirstCollectionRepositoryImpl(Datastore datastore) {
        this.datastore = datastore;
    }

    @Override
    public Key<FirstCollection> save(FirstCollection firstCollection) {
        return datastore.save(firstCollection);
    }

    @Override
    public FirstCollection get(Long id) {
        return datastore.get(FirstCollection.class, id);
    }

    @Override
    public Iterator<FirstCollectionGrouped> groupBy(String elementToGroupBy, String elementToPush) {
        return datastore.createAggregation(FirstCollection.class)
                .group(elementToGroupBy, Group.grouping("items", Group.push(elementToPush)))
                .out(FirstCollectionGrouped.class);
    }
}
