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
        while(!t.goods.isEmpty()) {
            Medicine unloaded = t.goods.remove(0);
            System.out.println(String.format("Receiving an %s.", unloaded.getMedicineName()));
        }
    }

    // Getter for hospital name
    public String name() {
        return name;
    }
}