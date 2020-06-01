package com.company;//package game;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class View {


    //  temporary this size set to 4 rows and 4 columns if needed to set it by user this variable must be modified by constructor
    private final int sizeArray = 4;

    //  final method may be make a mistake for this object if array not accessing to modified please check here
    private final Control ctrlObject = new Control(sizeArray);

    //  best structure using variable private in this package with integer variable name but now declared to private variable.
    private int [][]gameArray;


    //  clean Previous map if using windows os using cls else (using mac os or linux system using "^c".
    private void clear() throws IOException, InterruptedException {

        final String operatingSystem = System.getProperty("os.name");
        if (System.getProperty("os.name").contains("Windows"))
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        else
        {
            System.out.print("\033\143");
        }
    }

    public void startGame(){

        //  create game with makeGame function . when game make function called create game array with zero value and randomize select 2 position and values of these set to  2 or 4 value
        ctrlObject.makeGame();

        //allocation gameArray with ctrlObject gameArray values.
        gameArray = ctrlObject.getGameArray();

    }
    private void printGamePlan(){

        System.out.println(Arrays.deepToString(gameArray).replace("],", "],\n"));
//        for (int i = 0;i < sizeArray;i++)
//        {
//            for(int k = 0;k < sizeArray;k++)
//            {
//                System.out.printf('%s',gameArray[i][k]);
//            }
//        }
    }
    private void inputArrow(int arrow){

//        Scanner in = new Scanner(System.in);
//        int arrow = in.nextInt();
        //  I think about how to get arrow and write scanner input method for give a variable but mmad worked on it before and I didn't see that :|


        //  **** important point ****
        // if using keypad for arrow before pass to inputArrow function convert to int by this key
        //  up -> 0 , down -> 1 , right -> 2 , left -> 3
        ctrlObject.inputArrow(arrow);

    }
    private void Win(){
        if(ctrlObject.isWin())
            System.out.println("win");
    }
    private void Lose(){
        if (ctrlObject.isLose())
            System.out.println("Loss");
    }

    public void playing(int arrow) {
        inputArrow(arrow);
        printGamePlan();
//        clear();

//        if(ctrlObject.isWin())
//            Win();
//        else if(ctrlObject.isLose())
//            Lose();
//        else
//            printGamePlan();
    }
}
