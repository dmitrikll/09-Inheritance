package HW09.model;

import HW09.entity.Gamer;

public class AppPremiumWin extends AppBaseWin {

    @Override
    public double calcWin(Gamer winAmount) {
        return ((winAmount.getBet() * 200 / 100) - ((winAmount.getBet() * 200 / 100) * 10 / 100));
    }
}
