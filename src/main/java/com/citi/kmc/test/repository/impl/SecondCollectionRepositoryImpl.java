package com.citi.kmc.test.repository.impl;

import com.citi.kmc.test.model.SecondCollection;
import com.citi.kmc.test.repository.SecondCollectionRepository;
import dev.morphia.Datastore;
import dev.morphia.Key;
import dev.morphia.query.Query;
import java.util.List;

public class SecondCollectionRepositoryImpl implements SecondCollectionRepository {
    private final Datastore datastore;

    public SecondCollectionRepositoryImpl(Datastore datastore) {
        this.datastore = datastore;
    }

    @Override
    public Key<SecondCollection> save(SecondCollection secondCollection) {
        return datastore.save(secondCollection);
    }

    @Override
    public List<SecondCollection> getAll() {
        return datastore.createQuery(SecondCollection.class)
                .find()
                .toList();
    }
}
