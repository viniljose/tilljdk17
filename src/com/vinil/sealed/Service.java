package com.vinil.sealed;

/**
 * https://www.baeldung.com/java-sealed-classes-interfaces
 */
public sealed interface Service permits Car,Truck{
    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }
}
