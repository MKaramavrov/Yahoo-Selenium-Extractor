package com.citi.kmc.test.repository;

import com.citi.kmc.test.model.SecondCollection;
import dev.morphia.Key;
import java.util.List;

public interface SecondCollectionRepository {
    Key<SecondCollection> save(SecondCollection secondCollection);

    List<SecondCollection> getAll();


}
