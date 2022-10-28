package com.citi.kmc.test.service;

import com.citi.kmc.test.model.SecondCollection;
import dev.morphia.Key;
import java.util.List;

public interface SecondCollectionService {
    Key<SecondCollection> save(SecondCollection secondCollection);

    List<SecondCollection> getAll();

    double getAveragePrice();

    SecondCollection getLast();
}
