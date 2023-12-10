package HW09.controller;

import HW09.entity.Gamer;
import HW09.model.AppBaseModel;
import HW09.model.AppStandardModel;
import HW09.model.AppPremiumModel;
import HW09.utilites.AppRandomizer;
import HW09.utilites.AppRounder;
import HW09.utilites.Constants;
import HW09.view.AppView;

public class AppController {
    private final AppView view = new AppView();

    public void getWinAmount() {
        double data = view.getData();
        int randomNumber = AppRandomizer.randomValue();
        String output;

        Gamer gamerBet = getAmount(data);

        if (randomNumber < Constants.NUM_MIN) {
            AppBaseModel model = new AppBaseModel();
            String winnerPay = AppRounder.roundValue(model.calcWin(gamerBet));
            output = "\n*********" +
                    "\nDropped number: " + randomNumber +
                    "\nThe winnings amount to: " + winnerPay + " " + Constants.CURRENCY + ".";
            view.getOutput(output);

        } else if (randomNumber <= Constants.NUM_MAX) {
            AppStandardModel model = new AppStandardModel();
            String winnerPay = AppRounder.roundValue(model.calcWin(gamerBet));
            output = "\n*********" +
                    "\nDropped number: " + randomNumber +
                    "\nThe winnings amount to: " + winnerPay + " " + Constants.CURRENCY + ".";
            view.getOutput(output);

        } else {
            AppPremiumModel model = new AppPremiumModel();
            String winnerPay = AppRounder.roundValue(model.calcWin(gamerBet));
            output = "\n*********" +
                    "\nDropped number: " + randomNumber +
                    "\nThe winnings amount to: " + winnerPay + " " + Constants.CURRENCY + ".";
            view.getOutput(output);
        }
    }

    private Gamer getAmount(double data){
        return new Gamer(data);
    }
}
