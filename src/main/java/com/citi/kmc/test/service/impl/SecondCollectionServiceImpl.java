package com.citi.kmc.test.service.impl;

import com.citi.kmc.test.model.SecondCollection;
import com.citi.kmc.test.repository.SecondCollectionRepository;
import com.citi.kmc.test.service.SecondCollectionService;
import dev.morphia.Key;
import java.util.List;

public class SecondCollectionServiceImpl implements SecondCollectionService {
    private final SecondCollectionRepository repository;

    public SecondCollectionServiceImpl(SecondCollectionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Key<SecondCollection> save(SecondCollection secondCollection) {
        return repository.save(secondCollection);
    }

    @Override
    public List<SecondCollection> getAll() {
        return repository.getAll();
    }

    @Override
    public double getAveragePrice() {
        return getAll().stream()
                .map(SecondCollection::getStockPrice)
                .mapToDouble(x -> x).average().getAsDouble();
    }

    @Override
    public SecondCollection getLast() {
        List<SecondCollection> allItems = getAll();
        SecondCollection lastItem = allItems.get(0);
        for (int i = 0; i < allItems.size(); i++) {
            if(allItems.get(i).getTestTime() == null) {
                continue;
            }
            if (allItems.get(i).getTestTime().isAfter(lastItem.getTestTime())) {
                lastItem = allItems.get(i);
            }
        }
        return lastItem;
    }
}
