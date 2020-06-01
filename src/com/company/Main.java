package com.company;

//import Veiw
import java.io.IOException;
import java.util.Scanner;

public class Main {

    //  for clear console and load map again!
    //  clean Previous map if using windows os using cls else (using mac os or linux system using "^c".
//    private static void clear() throws IOException, InterruptedException {
//
//        final String operatingSystem = System.getProperty("os.name");
//        if (System.getProperty("os.name").contains("Windows"))
//        {
//            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//        }
//        else
//        {
//            System.out.print("\033\143");
//        }
//    }
    public static void test(int arrow) {
        View vw = new View();
        vw.startGame();
        vw.playing(arrow);
//        vw.startGame();
    }

    public static void main(String[] args) {



//        System.out.println("Hello mmad");
//        Main ml = new Main();
//        View game = new View();
//        game.startGame();
//        game.printGamePlan();

//        View game = View.class.newInstance();

//        Control cl = new Control();
        Scanner input = new Scanner(System.in);
        int arrow = input.nextInt();
        test(arrow);
        //convert arrow string to integer if get it  with press an key

        //            game.playing(arrow);
//            clear();
    }
}
