package edu.uc.cs3003.medava;

// Importing packages for reflection mechanism
// import java.lang.reflect.InvocationTargetException;
// import java.lang.reflect.Method;

// Importing java list types
import java.util.List;
import java.util.ArrayList;
public class Transporter {
    // Class attribute for transporter name
    private String mTransporterName;

    // Class attributes for lower and upper temperature bound
    private double mLowTemperature, mHighTemperature;

    // Define list of medicine to be stored in class
    public List<Shippable> goods;

    {
        goods = new ArrayList<Shippable>();
    }

    // Constructor for Transporter class
    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    // Function to load medicine into the transporter
    public boolean load(Shippable itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            return goods.add(itemToLoad);
        }
        return false;
    }

    // public boolean load (Object itemToLoad) {
        // try {
        //     Method isTemperatureRangeAcceptableMethod = itemToLoad.getClass().getMethod("isTemperatureRangeAcceptable",
        //             Double.class, Double.class);
        //     boolean resultOfMethodCall = (boolean) isTemperatureRangeAcceptableMethod.invoke(itemToLoad,
        //             Double.valueOf(mLowTemperature), Double.valueOf(mHighTemperature));
        //     if (resultOfMethodCall) {
        //         goods.add(itemToLoad);
        //     }
        //     return resultOfMethodCall;
        // } catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
        //         | InvocationTargetException e) {
        //     return false;
        // }
    // }

    // Function to unload medicine from the transporter
    public Shippable unload() {
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