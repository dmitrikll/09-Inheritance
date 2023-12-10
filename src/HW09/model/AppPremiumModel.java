package HW09.model;

import HW09.entity.Gamer;
import HW09.utilites.Constants;

public class AppPremiumModel extends AppBaseModel {

    @Override
    public double calcWin(Gamer gamer) {
        return ((gamer.getBet() * Constants.RATE_MAX / 100) - ((gamer.getBet() * Constants.RATE_MAX / 100) * Constants.TAX_MAX / 100));
    }
}