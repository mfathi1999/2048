package com.company;//package game;

import java.util.Scanner;

public class View {


    //  temporary this size set to 4 rows and 4 columns if needed to set it by user this variable must be modified by constructor
    private final int sizeArray = 4;

    //  final method may be make a mistake for this object if array not accessing to modified please check here
    private final Control ctrlObject = new Control(sizeArray);

    //  best structure using variable private in this package with integer variable name but now declared to private variable.
    private int [][]gameArray;

    public void startGame(){

        //  create game with makeGame function . when game make function called create game array with zero value and randomize select 2 position and values of these set to  2 or 4 value
        ctrlObject.makeGame();

        //allocation gameArray with ctrlObject gameArray values.
        gameArray = ctrlObject.getGameArray();

    }
    public void printGamePlan(){

        for (int i = 0;i < sizeArray;i++)
        {
            for(int k = 0;k < sizeArray;k++)
            {
                System.out.println(gameArray[i][k]);
            }
        }
    }
    public void inputArrow(int arrow){

//        Scanner in = new Scanner(System.in);
//        int arrow = in.nextInt();
        //  I think about how to get arrow and write scanner input method for give a variable but mmad worked on it before and I didn't see that :|


        //  **** important point ****
        // if using keypad for arrow before pass to inputArrow function convert to int by this key
        //  up -> 0 , down -> 1 , right -> 2 , left -> 3
        ctrlObject.inputArrow(arrow);

    }
    public void Win(){
        if(ctrlObject.isWin())
            System.out.println("win");
    }
    public void Lose(){
        if (ctrlObject.isLose())
            System.out.println("Loss");
    }
}
