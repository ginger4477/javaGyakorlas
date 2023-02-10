package org.example;

import java.util.ArrayList;
import java.util.List;

class Race {

    List<Driver> driverList = new ArrayList<>(10);

    Race() {

    }

    void addDriver(Driver driver) {
        driverList.add(driver);
    }

    void printDrivers(){
        for (Driver driver : driverList) {
            System.out.println("Driver name = " + driver.getName() + ", rank = " + (driverList.indexOf(driver) + 1));
        }

        for (int i = 0; i < driverList.size(); i++) {
            System.out.println("Driver name = " + driverList.get(i).getName() + ", rank = " + (i+1));
        }
    }

}
