package edu.uc.cs3003.medava;

// Importing java list types
import java.util.List;
import java.util.ArrayList;
public class Transporter {
    // Class attribute for transporter name
    private String mTransporterName;

    // Define list of medicine to be stored in class
    public List<Medicine> goods = new ArrayList<Medicine>();

    // Getter function (accessor) for transporter name
    public String getTransporterName(){
        return mTransporterName;
    }

    public void ship() {
        // Do some shipping!
    }
}