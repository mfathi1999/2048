package com.company;

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

    }
    private void moveDown(){

    }
    private void moveRight(){

    }
    private void moveLeft(){

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

    }
}
