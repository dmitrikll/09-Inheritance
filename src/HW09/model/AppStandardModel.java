package HW09.model;

import HW09.entity.Gamer;

public class AppStandardModel extends AppBaseModel {

    @Override
    public double calcWin(Gamer gamer) {
        return ((gamer.getBet() * 125 / 100) - (gamer.getBet() * 5 / 100));
    }
}