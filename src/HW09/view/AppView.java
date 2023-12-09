package HW09.view;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

    private final Scanner betScanner = new Scanner(System.in);

    public double getData() {
        System.out.print("Please, enter you bet C.U.: ");
        betScanner.useLocale(Locale.ENGLISH);
        return betScanner.nextDouble();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
