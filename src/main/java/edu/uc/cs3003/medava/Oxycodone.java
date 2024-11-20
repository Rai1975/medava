package edu.uc.cs3003.medava;

public class Oxycodone extends Medicine {
    // Constructor function
    public Oxycodone() {
        super("Oxycodone");
    }

    @Override
    public MedicineSchedule getSchedule() {
        return MedicineSchedule.Two;
    }
}