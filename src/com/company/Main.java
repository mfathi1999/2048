package com.company;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {


//    private static void welcome()
//    {
//        String welcome = "\n\n\nWelcome to 2048 Game ;) \nChoose the Arrow to move on blocks !\nYou can use [w for up, a for left, d for right, s for down .";
//        System.out.println(welcome);
//    }

    private static int handle(char arrow)
    {
        if(arrow =='w')
            return 0;
        else if(arrow == 's')
            return 1;
        else if(arrow == 'a')
            return 3;
        else if(arrow == 'd')
            return 2;

        return 0;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        View view = new View();
        view.startGame();
//        System.out.println("__   _____  _   _  __        _____ _   _ \n\\ \\ / / / / _ \\ \\| | | |    / /|_ _|\\ \\ |\n \\ V / | | | | | |  \\ \\ /\\ / / | ||  \\| |\n  | || |_| | |_| |   \\ V  V /  | || |\\  |\n  |_| \\___/ \\___/     \\_/\\_/  |___|_| \\_|\n");
//        System.out.println(" _     ___  ____  _____ \n| |   / _ \\/ ___|| ____|\n| |  | | | \\___ \\|  _|  \n| |__| |_| |___) | |___ \n|_____\\___/|____/|_____|\n");
//        welcome();
        view.printGamePlan();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            char input  = scanner.next().charAt(0);
            System.out.println(input);
            int arrow = handle(input);
//            int input = scanner.nextInt();
//            view.inputArrow(input);
            view.inputArrow(arrow);
            view.printGamePlan();
        }

        }

};
