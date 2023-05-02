package com.codeofcoin.appcore;

import java.util.Random;
import java.util.Scanner;

public class AppRuner {
    public static void main(String[] args) {
        // Listener will be used to receive user's response
        var listener = new Scanner(System.in);

        // All logic encapsulated in teacher obj
        // TODO: There is no need in multiple teachers. Singleton this class.
        var teacher = new Teacher();
        // Creating a problem
        teacher.giveProblem();
        System.out.print("Please write your answer: ");

        // Victory check, with user's answer
        if(teacher.checkAnswer(listener.nextInt())){
            System.out.println("Congratulations, your answer is right!");
        } else {
            System.out.println("Wrong, your answer isn't correct.");
        }
    }
}
