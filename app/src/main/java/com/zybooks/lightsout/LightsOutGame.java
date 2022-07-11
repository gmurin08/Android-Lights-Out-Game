package com.zybooks.lightsout;
import java.util.Random;

public class LightsOutGame {
    public static final int NUM_ROWS = 3;
    public static final int NUM_COLS = 3;

    //Lights that make up the grid
    private boolean[][] mLights;

    public LightsOutGame(){
        mLights = new boolean[NUM_ROWS][NUM_COLS];
    }

    public void newGame(){
        Random randomNumberGenerator = new Random();
        for(int row = 0; row < NUM_ROWS; row++){
            for(int col = 0; col < NUM_COLS; col++){
                mLights[row][col]=randomNumberGenerator.nextBoolean();
            }
        }
    }

    public boolean isLightOn(int row, int col){
        return mLights[row][col];
    }

    public void selectLight(int row, int col){
        mLights[row][col] = !mLights[row][col];
        if (row > 0) {
            mLights[row - 1][col] = !mLights[row - 1][col];
        }
        if (row < NUM_ROWS - 1) {
            mLights[row + 1][col] = !mLights[row + 1][col];
        }
        if (col > 0) {
            mLights[row][col - 1] = !mLights[row][col - 1];
        }
        if (col < NUM_COLS - 1) {
            mLights[row][col + 1] = !mLights[row][col + 1];
        }
    }

    public boolean isGameOver(){
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                if (mLights[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

}