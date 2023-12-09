package HW09.entity;

import HW09.utilites.AppRandomizer;

public class Gamer {

    private final double bet;
    private final int randomNumber = AppRandomizer.randomValue();

    public Gamer(double bet) {
        this.bet = bet;
    }

    public double getBet() {
        return bet;
    }

//    public int getRandomNumber() {
//        System.out.println("Random number is: " + randomNumber);
//        return randomNumber;
//    }
}
