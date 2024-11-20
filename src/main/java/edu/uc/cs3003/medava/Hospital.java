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
            System.out.println(String.format("Checking whether Hospital can receive %s.", unloaded.getMedicineName()));
            if (unloaded.getSchedule() != MedicineSchedule.Uncontrolled) {
                System.out.println(String.format("Hospital cannot receive controlled substances and %s is a %s", unloaded.getMedicineName(), unloaded.getSchedule().asString()));
            } else {
                System.out.println(String.format("Accepted a shipment of %s.", unloaded.getMedicineName()));
            }
        }
    }

    // Getter for hospital name
    public String name() {
        return name;
    }
}