package com.citi.kmc.test.service;

import com.citi.kmc.test.model.FirstCollection;
import com.citi.kmc.test.model.FirstCollectionGrouped;
import dev.morphia.Key;
import java.util.Iterator;

public interface FirstCollectionService {
    Key<FirstCollection> save(FirstCollection firstCollection);

    FirstCollection get(Long id);

    Iterator<FirstCollectionGrouped> groupBy(String elementToGroupBy, String elementToPush);
}
