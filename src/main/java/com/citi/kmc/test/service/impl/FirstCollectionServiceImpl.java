package com.citi.kmc.test.service.impl;

import com.citi.kmc.test.model.FirstCollection;
import com.citi.kmc.test.model.FirstCollectionGrouped;
import com.citi.kmc.test.repository.FirstCollectionRepository;
import com.citi.kmc.test.service.FirstCollectionService;
import dev.morphia.Key;
import java.util.Iterator;

public class FirstCollectionServiceImpl implements FirstCollectionService {
    private final FirstCollectionRepository repository;

    public FirstCollectionServiceImpl(FirstCollectionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Key<FirstCollection> save(FirstCollection firstCollection) {
        return repository.save(firstCollection);
    }

    @Override
    public FirstCollection get(Long id) {
        return repository.get(id);
    }

    @Override
    public Iterator<FirstCollectionGrouped> groupBy(String elementToGroupBy, String elementToPush) {
        return repository.groupBy(elementToGroupBy, elementToPush);
    }
}
