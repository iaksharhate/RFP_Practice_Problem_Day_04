package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadderUC4 {
    public static void main(String[] args) {
        int position = 0;

        System.out.println("Welcome to Snake & Ladder Game!!");
        System.out.println("Your are at starting position: " + position);

        Random random = new Random();
        int dice = random.nextInt(6) + 1;
        System.out.println("Dice value: " + dice);

        Game game = new Game();
        game.rollingDice(position, dice);
    }
}

    class Game{

        public void rollingDice(int position, int dice){
            while (position <= 99) {

                Random random1 = new Random();
                int value = random1.nextInt(3) + 1;

                switch (value) {
                    case 1:
                        //System.out.println("No Play you stays in the same position.");
                        break;

                    case 2:
                        position = position + dice;
                        //System.out.println("After ladder your position is: " + position);
                        break;

                    case 3:
                        position = position - dice;
                        //System.out.println("After snake your position is: " + position);
                        break;
                }
            }
            if (position < 0){
                position = 0;
            }
            System.out.println("Your Position:" +position);
        }
    }
