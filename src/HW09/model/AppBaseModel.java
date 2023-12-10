package HW09.model;

import HW09.entity.Gamer;
import HW09.variables.Constants;

public class AppBaseModel {

    public double calcWin(Gamer gamer) {
        return (gamer.getBet() * Constants.RATE_MIN / 100);
    }
}