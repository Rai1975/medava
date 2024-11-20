package edu.uc.cs3003.medava;

public enum MedicineSchedule {
    // Enumeration
    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Uncontrolled(6);

    // Schedule class attribute
    private int mSchedule;

    private MedicineSchedule(int Schedule) {
        mSchedule = Schedule;
    }

    // Converting integer enums to strings
    public String asString() {
        switch(mSchedule) {
            case 1:
                return "Schedule One Medicine";
            case 2:
                return "Schedule Two Medicine";
            case 3:
                return "Schedule Three Medicine";
            case 4:
                return "Schedule Four Medicine";
            case 5:
                return "Schedule Five Medicine";
            default:
                return "Uncontrolled";
        }
    }
}