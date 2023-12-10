package HW09.model;

import HW09.entity.Gamer;

public class AppBaseModel {

    public double calcWin(Gamer gamer) {
        return (gamer.getBet() * 125 / 100);
    }
}