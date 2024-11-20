package edu.uc.cs3003.medava;

public class Ibuprofen extends Medicine {

    // Constructor function
    public Ibuprofen() {
        super("Ibuprofen");
    }

    // Defining it's schedule type
    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Uncontrolled;
    }

    // Defining minimum temperature
    @Override
    public double minimumTemperature() {
        return 30.0;
    }

    // Defining maximum temperature
    @Override
    public double maximumTemperature() {
        return 90.0;
    }
}