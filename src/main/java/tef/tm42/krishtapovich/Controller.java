package tef.tm42.krishtapovich;

import java.util.Scanner;

class Controller {
    // Constructor
    private final Model model;
    private final View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setBounds(Globals.INITIAL_MIN, Globals.INITIAL_MAX);
        model.setNumSet();
        //view.printMessage(""+model.getNumSet());

        while (!model.checkValue(inputIntValueWithScanner(sc))) {
        }

        view.printMessage(View.OUR_INT + model.getNumSet());
        view.printMessage(View.YOUR_WAY + String.valueOf(model.getYourWay()));
        view.printMessage(View.TRIES + model.getTries());
        view.printMessage(View.ACCURACY + 100 / model.getTries() + View.PERCENT);

    }

    private int inputIntValueWithScanner(Scanner sc) {
        int res;
        view.printMessage(getInputIntMessage());
        while ((true)) {
            // check int-value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_TYPE_DATA + getInputIntMessage());
                sc.next();
            }
            // check value into diapason
            if ((res = sc.nextInt()) <= model.getLowerBound()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA_LESS + getInputIntMessage());
                continue;
            } else if (res >= model.getUpperBound()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA_MORE + getInputIntMessage());
                continue;
            }
            break;
        }
        return res;
    }

    private String getInputIntMessage() {
        return view.concatenationString(
                View.INI_DATA, String.valueOf(model.getLowerBound()),
                View.SPACE, String.valueOf(model.getUpperBound()), View.INI_DATA_P2);
    }

}
