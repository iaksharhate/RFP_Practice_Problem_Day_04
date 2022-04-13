package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadderUC6 {
    public static void main(String[] args) {
        int position = 0;
        int diceRollCount = 0;

        System.out.println("Welcome to Snake & Ladder Game!!");
        System.out.println("Your are at starting position: " + position);

        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        System.out.println("Dice value: " + dice);

        Game game = new Game();
        game.rollingDice(position, dice, diceRollCount);
    }
}
class Game{

    public void rollingDice(int position, int dice, int diceRollCount){
        while (position <= 99) {

            Random random1 = new Random();
            int value = random1.nextInt(3) + 1;

            diceRollCount++;

            switch (value) {
                case 1:
                    //System.out.println("No Play you stays in the same position.");
                    break;

                case 2:
                    position = position + dice;
                    if (position > 100){
                        position = (position - dice);
                        continue;
                    }
                    System.out.println("After ladder your position is: " + position);
                    break;

                case 3:
                    position = position - dice;
                    if (position < 0){
                        position = 0;
                    }
                    System.out.println("After snake your position is: " + position);
                    break;
            }
        }
        System.out.println("Your Position:" +position);
        System.out.println("Total rolls of dice: "+diceRollCount);
    }
}
