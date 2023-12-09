package HW09.model;

import HW09.entity.Gamer;

public class AppStandardWin extends AppBaseWin {

    @Override
    public double calcWin(Gamer winAmount) {
        return ((winAmount.getBet() * 125 / 100) - (winAmount.getBet() * 5 / 100));
    }
}
