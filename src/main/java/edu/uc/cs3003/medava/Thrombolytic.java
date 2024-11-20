package edu.uc.cs3003.medava;

public class Thrombolytic extends Medicine {
    // Constructor function
    public Thrombolytic() {
        super("Thrombolytic");
    }

    // Defining it's minimum temperature
    @Override
    public double minimumTemperature() {
        System.out.println("Getting the minimum safe temperature for a Thrombolytic drug.");
        return 39.2;
    }

    // Defining it's maximum temperature
    @Override
    public double maximumTemperature() {
        System.out.println("Getting the maximum safe temperature for a Thrombolytic drug.");
        return 41.0;
    }

    // Defining it's schedule type
    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }
}