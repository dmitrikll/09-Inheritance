package HW09.model;

import HW09.entity.Gamer;
import HW09.utilites.Constants;

public class AppStandardModel extends AppBaseModel {

    @Override
    public double calcWin(Gamer gamer) {
        return ((gamer.getBet() * Constants.RATE_MIN / 100) - (gamer.getBet() * Constants.TAX_MIN / 100));
    }
}