package HW09.model;

import HW09.entity.Gamer;

public class AppBaseWin {

    public double calcWin(Gamer winAmount) {
        return (winAmount.getBet() * 125 / 100);
    }
}
