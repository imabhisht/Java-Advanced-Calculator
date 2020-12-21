package src;

import java.util.Scanner;

public class AdvancedOperation {
    public static String FilterAnswer(double a) {
        Scanner Input_Instance = new Scanner(System.in);
        String Advanced_Choice;
        while (true) {
            System.out.print("Calculated Answer is: " + a + " \nFilter Answer??[Y/N]: ");
            char Advanced_Operation = Input_Instance.next().charAt(0);
            if (Advanced_Operation == 'Y' || Advanced_Operation == 'y') {
                System.out.println("Type -> 'roundint' to Round to Nearest Interger");
                System.out.println("Type -> 'rounddec' to Round to Decimal Place.");
                System.out.print("Type:    ");
                Advanced_Choice = Input_Instance.next();
                if ("roundint".equals(Advanced_Choice)) {
                    Input_Instance.close();
                    int IntValue = (int) Math.round(a);
                    return Integer.toString(IntValue);
                } else if ("rounddec".equals(Advanced_Choice)) {
                    Input_Instance.close();
                    double DoubleValue = Math.round(a * 100.0) / 100.0;
                    return Double.toString(DoubleValue);
                } else {
                    System.out.println("Invalid Choice. Please Try Again");
                }
            } else if (Advanced_Operation == 'N' || Advanced_Operation == 'n') {
                Input_Instance.close();
                return Double.toString(a);
            } else {
                System.out.println("Invalid Choice. Please Try Again");
                continue;
            }

        }
    }
}
