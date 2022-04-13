package com.bridgelabz;
import java.util.Random;

public class SnakeAndLadderUC2 {
    public static void main(String[] args) {
        int position = 0;

        System.out.println("Welcome to Snake & Ladder Game!!");
        System.out.println("Your are at starting position: "+position);
        Dice();
    }
    public static void Dice(){
        Random random = new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice value: "+dice);
    }
}