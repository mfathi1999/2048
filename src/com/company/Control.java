package com.company;

import java.util.LinkedList;
import java.util.Random;

public class Control {

    private int[][] gameArray;
    private int score;
    private int gameArraySize;
    private boolean win;


    public Control(){
        this(4);
    }
    public Control(int size){
        gameArraySize = size;
        gameArray = new int[gameArraySize][gameArraySize];
        score = 0;
        win = false;


    }
    public int[][] getGameArray() {
        return gameArray;
    }

    public int getScore() {
        return score;
    }

    public void makeGame(){
        //create game for start
        for(int row=0;row<gameArraySize;++row){
            for(int col=0;col<gameArraySize;++col){
                gameArray[row][col] = 0;
            }
        }
        // need two numeric home for begin
        randomNewHome();
        randomNewHome();
    }

    public void inputArrow(int arrow){
        switch (arrow){
            case 0:// move up
                moveUp();
                break;
            case 1:// move down
                moveDown();
                break;
            case 2://move right
                moveRight();
                break;
            case 3://move left
                moveLeft();
                break;
            default:
                break;
        }

    }

    private void moveUp(){
        rotateLeft(90);
        moveLeft();
        rotateRight(90);
    }
    private void moveDown(){
        rotateRight(90);
        moveLeft();
        rotateLeft(90);
    }
    private void moveRight(){
        rotateLeft(180);
        moveLeft();
        rotateRight(180);
    }
    private void moveLeft(){

        for(int i=0;i<gameArraySize;i++){
            LinkedList<Integer> linkedList = new LinkedList<Integer>();

            for(int j=0;j<gameArraySize;j++){
                if(gameArray[i][j] != 0){
                    if(gameArray[i][j] == linkedList.getFirst()) {
                        linkedList.removeFirst();
                        linkedList.addLast(gameArray[i][j] * 2);
                        gameArray[i][j] = 0;
                    }
                }
            }
            for(int j=0;!linkedList.isEmpty();j++){
                gameArray[i][j]= linkedList.removeFirst();
            }

        }
    }

    private void rotateLeft(int degree){ // 90 or 180 degree
        if(degree == 90){
            int [][] rotetedGameArray = new int[gameArraySize][gameArraySize];
            for(int row=0;row<gameArraySize;row++){
                for(int col=0;col<gameArraySize;col++){
                    rotetedGameArray[gameArraySize-col-1][row]=gameArray[row][col]
                }
            }
            gameArray = rotetedGameArray;
        }
        else if(degree == 180){
            rotateLeft(90);
            rotateLeft(90);
        }
    }
    private void rotateRight(int degree){ // 90 or 180 degree
        if(degree == 90){
            int [][] rotetedGameArray = new int[gameArraySize][gameArraySize];
            for(int row=0;row<gameArraySize;row++){
                for(int col=0;col<gameArraySize;col++){
                    rotetedGameArray[col][gameArraySize-row-1]=gameArray[row][col];
                }
            }
            gameArray = rotetedGameArray;
        }
        else if(degree == 180){
            rotateLeft(90);
            rotateLeft(90);
        }
    }

    //return true if player win the game
    public boolean isWin(){
        return  win;
    }
    public boolean isLose(){
        // return true if player lose the Game
        return true;
    }
    public void randomNewHome(){
        Random rand = new Random();
        int row  = rand.nextInt(gameArraySize); // bound 0 - game array size for example 0-4
        int column  = rand.nextInt(gameArraySize);
        //  if point have a value we must get random position again

        // this method may be have bug if all of the points have value and player not yet loss this loop not be stop
        // we can declare a variable to solve this problem
        int checkAllPointSelected = 0;
        while(gameArray[row][column] != 0)
        {
            if(checkAllPointSelected == gameArraySize * gameArraySize)
                // may be not working for this problem convert to break and random point value should not set 2 of 4 .
                return;

            row  = rand.nextInt(gameArraySize);
            column  = rand.nextInt(gameArraySize);
            checkAllPointSelected ++;
        }
        int selectBetween2Or4 = rand.nextInt(2); // we need 0 or 1 to select item

        //**** important ****
        // if use break in while loop should not set value for randomize point
//        gameArray[row][column];

        if(selectBetween2Or4 == 1)
        {
            gameArray[row][column] = 4;
        }
        else
        {
            gameArray[row][column] = 2;
        }
    }
}
