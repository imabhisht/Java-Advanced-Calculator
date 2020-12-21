package src;

import java.util.Scanner;

public class Input_Values {
    public static double InputUserValue() {
        while (true) {
            Scanner Input_Instance = new Scanner(System.in);
            boolean Alpha_Checker = Input_Instance.hasNextDouble();

            if (!Alpha_Checker) {
                System.out.println("Input is not Valid!! Try again...");
            } else {
                return Input_Instance.nextDouble();
            }
        }

    }
}
