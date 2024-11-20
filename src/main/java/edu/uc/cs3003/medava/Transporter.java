package edu.uc.cs3003.medava;

// Importing java list types
import java.util.List;
import java.util.ArrayList;
public class Transporter {
    // Class attribute for transporter name
    private String mTransporterName;

    // Class attributes for lower and upper temperature bound
    private double mLowTemperature, mHighTemperature;

    // Define list of medicine to be stored in class
    public List<Medicine> goods;

    {
        goods = new ArrayList<Medicine>();
    }

    // Constructor for Transporter class
    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    // Function to load medicine into the transporter
    public boolean load(Medicine itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    // Function to unload medicine from the transporter
    public Medicine unload() {
        return goods.remove(0);
    }

    // Function to check if there are no goods
    public boolean isEmpty() {
        return goods.isEmpty();
    }

    // Getter function (accessor) for transporter name
    public String getTransporterName(){
        return mTransporterName;
    }

    public void ship() {
        // Do some shipping!
    }
}