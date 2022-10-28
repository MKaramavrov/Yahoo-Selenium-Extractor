package com.citi.kmc.test;

import com.citi.kmc.test.config.Config;

public class Main extends Config {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.firstCollectionService
                .groupBy("launchDuration", "_id"));
        System.out.println(main.secondCollectionService.getAveragePrice());
        System.out.println(main.secondCollectionService.getLast());
    }
    }
