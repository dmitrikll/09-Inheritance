package HW09.utilites;

import java.text.DecimalFormat;

public class AppRounder {

    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}
