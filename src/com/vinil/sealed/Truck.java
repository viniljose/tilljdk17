package com.vinil.sealed;

public final class Truck extends Vehicle implements Service{
    private final int loadCapacity;

    public Truck(int loadCapacity, String registrationNumber) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Truck(100,"KA011234");
        if (vehicle instanceof Car) {
            System.out.println( ((Car) vehicle).getNumberOfSeats());
        } else if (vehicle instanceof Truck) {
            System.out.println( ((Truck) vehicle).getLoadCapacity());
        } else {
            throw new RuntimeException("Unknown instance of Vehicle");
        }
    }
}
