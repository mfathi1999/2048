package com.company;//package game;

public class View {


    //  temporary this size set to 4 rows and 4 columns if needed to set it by user this variable must be modified by constructor
    private final int sizeArray = 4;

    //  final method may be make a mistake for this object if array not accessing to modified please check here
    private final Control ctrlObject = new Control(sizeArray);

    //  best structure using variable private in this package with integer variable name but now declared to private variable.
//    private int [][]gameArray;


    //  clean Previous map if using windows os using cls else (using mac os or linux system using "^c".
//    private void clear() throws IOException, InterruptedException {
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

    public void startGame(){

        //  create game with makeGame function . when game make function called create game array with zero value and randomize select 2 position and values of these set to  2 or 4 value
        ctrlObject.makeGame();

        //allocation gameArray with ctrlObject gameArray values.
//        gameArray = ctrlObject.getGameArray();

    }
    public void printGamePlan(){
        int[][] gameArray = ctrlObject.getGameArray();
        for (int i = 0;i < sizeArray;i++)
        {
            for(int k = 0;k < sizeArray;k++)
            {
                System.out.print(gameArray[i][k] + "\t");
            }
            System.out.println();
        }
    }
    public void inputArrow(int arrow){
        if(ctrlObject.isLose()){
            Lose();
        }
        if(ctrlObject.isWin()){
            Win();
        }
        ctrlObject.inputArrow(arrow);

//        gameArray=ctrlObject.getGameArray();

    }
    private void Win(){
        if(ctrlObject.isWin()) {
            System.out.println("win");
            System.exit(0);

        }
    }
    private void Lose(){
        if (ctrlObject.isLose()) {
            System.out.println("Loss");
            System.exit(0);

        }
    }


}

