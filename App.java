import src.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner Input_Instance = new Scanner(System.in);
        boolean Alpha_Checker = false;
        String lamp;
        double UserInput_1, UserInput_2, UserAnswer;

        System.out.print("Input #1: ");
        UserInput_1 = Input_Values.InputUserValue();
        System.out.print("Input #2: ");
        UserInput_2 = Input_Values.InputUserValue();

        while (true) {
            System.out.print("Input Operator: ");
            char User_Operation = Input_Instance.next().charAt(0);

            switch (User_Operation) {
                case '+':
                    UserAnswer = AdditionOperation.Addition(UserInput_1, UserInput_2);
                    lamp = AdvancedOperation.FilterAnswer(UserAnswer);
                    System.out.println("Answer = " + lamp);
                    Alpha_Checker = true;
                    break;
                case '-':
                    UserAnswer = SubtractionOperation.Subtraction(UserInput_1, UserInput_2);
                    lamp = AdvancedOperation.FilterAnswer(UserAnswer);
                    System.out.println("Answer = " + lamp);
                    Alpha_Checker = true;
                    break;
                case '/':
                    UserAnswer = DivisionOperation.Division(UserInput_1, UserInput_2);
                    lamp = AdvancedOperation.FilterAnswer(UserAnswer);
                    System.out.println("Answer = " + lamp);
                    Alpha_Checker = true;
                    break;
                case '*':
                    UserAnswer = MultiplicationOperation.Multiplication(UserInput_1, UserInput_2);
                    lamp = AdvancedOperation.FilterAnswer(UserAnswer);
                    System.out.println("Answer = " + lamp);
                    Alpha_Checker = true;
                    break;

                default:
                    System.out.println("You have Entered Wrong Operation\n[ONLY +,-,*,/ ARE ALLOWED]");
            }
            if (Alpha_Checker) {
                Input_Instance.close();
                break;
            }
        }
    }
}