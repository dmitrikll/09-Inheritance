package HW09.model;

import HW09.entity.Gamer;

public class AppPremiumModel extends AppBaseModel {

    @Override
    public double calcWin(Gamer gamer) {
        return ((gamer.getBet() * 200 / 100) - ((gamer.getBet() * 200 / 100) * 10 / 100));
    }
}