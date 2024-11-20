package edu.uc.cs3003.medava;

public class Pharmacy {
    // Pharmacy name attribute
    private String mPharmacyName;

    // Constructor
    public Pharmacy(String pharmacyName) {
        mPharmacyName = pharmacyName;
    }

    // Send function
    public boolean send(Transporter t) {
        Medicine advil = new Medicine("Advil");
        System.out.println(String.format("Sending an %s.", advil.getMedicineName()));
        return t.goods.add(advil);
    }

    // Getter for pharmacy name
    public String pharmacyName() {
        return mPharmacyName;
    }
}