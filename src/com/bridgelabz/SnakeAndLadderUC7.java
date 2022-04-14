package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderUC7 {
    public static void main(String[] args) {
        int positionPlayer1 = 0;
        int positionPlayer2 = 0;
        int diceRollCount = 0;

        System.out.println("Welcome to Snake & Ladder Game!!");
        System.out.println("Player 1 position is: " + positionPlayer1);
        System.out.println("Player 2 position is: " + positionPlayer2);

        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;

        Random random2 = new Random();
        int dice2 = random.nextInt(6) + 1;


        Game game = new Game();
        game.rollingDice(positionPlayer1,positionPlayer2,dice1,dice2,diceRollCount);
    }
}
class Game{

    public void rollingDice(int positionPlayer1,int positionPlayer2,int dice1,int dice2, int diceRollCount){
        while ((positionPlayer1 <= 99)&&(positionPlayer2 <= 99)) {

            Random random = new Random();
            int valuePlayer1 = random.nextInt(3) + 1;

            Random random2 = new Random();
            int valuePlayer2 = random.nextInt(3) + 1;

            diceRollCount++;

            switch (valuePlayer1) {
                case 1:
                    //System.out.println("No Play you stay in the same position.");
                    break;

                case 2:
                    positionPlayer1 = positionPlayer1 + dice1;
                    if (positionPlayer1 > 100){
                        positionPlayer1 = (positionPlayer1 - dice1);
                        continue;
                    }
                    System.out.println("After ladder your position is: " + positionPlayer1);
                    break;

                case 3:
                    positionPlayer1 = positionPlayer1 - dice1;
                    if (positionPlayer1 < 0){
                        positionPlayer1 = 0;
                    }
                    System.out.println("After snake your position is: " + positionPlayer1);
                    break;
            }
            switch (valuePlayer2) {
                case 1:
                    //System.out.println("No Play you stay in the same position.");
                    break;

                case 2:
                    positionPlayer2 = positionPlayer2 + dice2;
                    if (positionPlayer2 > 100){
                        positionPlayer2 = (positionPlayer2 - dice2);
                        continue;
                    }
                    System.out.println("After ladder your position is: " + positionPlayer2);
                    break;

                case 3:
                    positionPlayer2 = positionPlayer2 - dice2;
                    if (positionPlayer2 < 0){
                        positionPlayer2 = 0;
                    }
                    System.out.println("After snake your position is: " + positionPlayer2);
                    break;
            }
        }
        System.out.println("Player 1 final Position is: " + positionPlayer1);
        System.out.println("Player 2 final Position is: " + positionPlayer2);
        System.out.println("dice play number:: " + diceRollCount);
    }
}