package edu.uc.cs3003.medava;

public class Jarvik implements Shippable{
    // Constructor function
    Jarvik(String deviceSerialNumber) {
    serialNumber = deviceSerialNumber;
    }

    // Getter (accessor) for medicine name
    public String getMedicineName() {
    return "Jarvik Artificial Heart";
    }

    // Function to get schedule
    public MedicineSchedule getSchedule() {
    return MedicineSchedule.Uncontrolled;
    }

    // Getter for serial number property
    public String getSerialNumber() {
    return serialNumber;
    }

    // Function to check if Jarvik is within the same temperature range
    public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
    if (30.0 <= lowTemperature && highTemperature <= 90.0) {
        return true;
    }
    return false;
    }

    // Class attribute for serial number
    private String serialNumber;
}