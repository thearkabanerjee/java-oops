package practicejava;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args){

        String[] questions = {"what is the main function of a router", "which part of the computer is consideered the brain", "what year was facebook launched", "who is known as the father of computers", "what was the first programming language"};
        String [][] options = {{"1. storing files", "2.encrypting data", "3. directing internet traffic", "4.managing passwords"},
            {"1. CPU","2. ram", "3. gpu", "4. hard drive" },
            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"}, 
            {"1. steve jobs", "2. alan turing", "3. bill gates", "charles babbage"}, 
            {"1. python", "2. cobol", "3. fortran", "4. assembly"}
        };

        int[] array = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner sc = new Scanner (System.in);

        System.out.println("*****************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
        System.out.println("*****************************");

        for (int i = 0; i< questions.length; i++){
            System.out.println(questions[i]);
            
        }





        sc.close();
    }
}
