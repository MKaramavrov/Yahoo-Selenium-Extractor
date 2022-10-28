package com.citi.kmc.test.config;

import com.citi.kmc.test.repository.FirstCollectionRepository;
import com.citi.kmc.test.repository.SecondCollectionRepository;
import com.citi.kmc.test.repository.impl.FirstCollectionRepositoryImpl;
import com.citi.kmc.test.repository.impl.SecondCollectionRepositoryImpl;
import com.citi.kmc.test.selenium.seleniumconfig.CommonActions;
import com.citi.kmc.test.service.FirstCollectionService;
import com.citi.kmc.test.service.SecondCollectionService;
import com.citi.kmc.test.service.impl.FirstCollectionServiceImpl;
import com.citi.kmc.test.service.impl.SecondCollectionServiceImpl;
import com.mongodb.MongoClient;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import org.openqa.selenium.WebDriver;

public class Config extends CommonActions {
    protected Morphia morphia = new Morphia();
    protected WebDriver driver = CommonActions.createDriver();
    protected Datastore datastore = morphia.createDatastore(new MongoClient(), "morphia");
    protected FirstCollectionRepository repository =
            new FirstCollectionRepositoryImpl(datastore);
    protected FirstCollectionService firstCollectionService = new FirstCollectionServiceImpl(repository);
    protected SecondCollectionRepository secondCollectionRepository =
            new SecondCollectionRepositoryImpl(datastore);
    protected SecondCollectionService secondCollectionService =
            new SecondCollectionServiceImpl(secondCollectionRepository);
}
