package edu.uc.cs3003.medava;

public abstract class Medicine implements Shippable{
    private String mMedicineName;

    // Constructor for medicine class
    public Medicine(String medicineName) {
        mMedicineName = medicineName;
    }

    // Getter function (accessor) for medicine's name
    public String getMedicineName() {
        return mMedicineName;
    }

    // Defining minimum temperature virtual method
    public double minimumTemperature() {
        return 0.0;
    }

    // Defining maximum temperature virtual method
    public double maximumTemperature() {
        return 100.0;
    }

    // Pure virtual function (abstract method) for schedules
    public abstract MedicineSchedule getSchedule();

    // Function to check if temperature is in a valid range
    public boolean isTemperatureRangeAcceptable(Double lowTempaerature, Double highTermparature) {
        if (this.minimumTemperature() <= lowTempaerature &&
            highTermparature <= this.maximumTemperature()) {
                return true;
            }

        return false;
    }
}