package com.company;


//import Veiw
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        View view = new View();
        view.startGame();
        view.printGamePlan();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            view.inputArrow(input);
            view.printGamePlan();
        }


    }
}