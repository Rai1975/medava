package edu.uc.cs3003.medava;

public class Hospital {
    // Name attribute
    private String name;

    // Constructor for hospital class
    public Hospital(String hostpitalName) {
        name = hostpitalName;
    }

    // Receive function
    void receive(Transporter t) {
        while(!t.isEmpty()){
            Medicine unloaded = t.unload();
            System.out.println(String.format("Receiving %s off the %s transporter.", unloaded.getMedicineName(), t.getTransporterName()));
        }
    }

    // Getter for hospital name
    public String name() {
        return name;
    }
}