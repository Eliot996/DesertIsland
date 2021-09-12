package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] options = {"kæreste","kaffemaskine","Netflix","sofa","løbesko", "guitar","slik", "hund", "bog", "øl" };
        int[] choices = new int[options.length];

        int amountOfChoicesLeft = 5;
        int mostPopularchoice = -1;

        // print out the choices, with 1 added to the index, to make it easier for the user
        System.out.println("Hvilken ting vil du helst have med på en øde ø?");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i+1) + " " + options[i]);
        }

        // get the choices, while the amountOfChoicesLeft is more than 0
        do {
            int choice;

            System.out.print("Indtast valg:");
            choice = input.nextInt();

            // if the input is within the options, the add 1 to the counter for the specific item,
            // else promt for a new try
            if (choice > 0 && choice <= options.length){
                choices[choice-1]++;
                System.out.println(options[choice-1]);
                amountOfChoicesLeft--;
            } else {
                System.out.print("Invalid input, please try again: ");
            }

        } while (amountOfChoicesLeft > 0);


        // checks if the current mostPopularchoice is smaller than the current item, the adjusts if nessecary
        for (int i = 0; i < choices.length; i++) {
            if (mostPopularchoice == -1){
                mostPopularchoice = i;
            }else{
                if (choices[i] > choices[mostPopularchoice]) {
                    mostPopularchoice = i;
                    System.out.println("test");
                }
            }
        }

        // print the most popular option
        System.out.println("Det mest populære valg er: " + options[mostPopularchoice]);

    }
}
