package HW09.controller;

import HW09.entity.Gamer;
import HW09.model.AppBaseWin;
import HW09.model.AppStandardWin;
import HW09.model.AppPremiumWin;
import HW09.utilites.AppRandomizer;
import HW09.utilites.AppRounder;
import HW09.view.AppView;


public class AppController {

    private final AppView view = new AppView();

    public void getWinAmount() {
        double data = view.getData();
        int randomNumber = AppRandomizer.randomValue();
        String output;

        Gamer gamerBet = getAmount(data);

        if (randomNumber < 3) {
            AppBaseWin model = new AppBaseWin();
            String winnerPay = AppRounder.roundValue(model.calcWin(gamerBet));
            output = "\nBet: " + data + "\nNumber: " + randomNumber + "\nWin Amount: " + winnerPay;
            view.getOutput(output);
        } else if (randomNumber <= 7) {
            AppStandardWin model = new AppStandardWin();
            String winnerPay = AppRounder.roundValue(model.calcWin(gamerBet));
            output = "\nBet: " + data + "\nNumber: " + randomNumber + "\nWin Amount: " + winnerPay;
            view.getOutput(output);
        } else {
            AppPremiumWin model = new AppPremiumWin();
            String winnerPay = AppRounder.roundValue(model.calcWin(gamerBet));
            output = "\nBet: " + data + "\nNumber: " + randomNumber + "\nWin Amount: " + winnerPay;
            view.getOutput(output);
        }
    }


    private Gamer getAmount(double data){
        return new Gamer(data);
    }


}
