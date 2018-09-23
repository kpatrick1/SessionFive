package us.kpatrick.enums;

import java.util.Scanner;

/**
 * PROGRAM DEALING WITH ENUMS
 * @author kpatr
 * @version  1.0.0
 */
public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    /**
     * INITIAL STARTING POINT OF THE PROGRAM
     * @param args STARTING ARGS OF THE PROGRAM
     */
    public static void main(String[] args) {
        System.out.println("What is your favorite NFC Team");
        String abbrev = keyboard.nextLine().substring(0,3);
        try {
            printTeam(NFCMascot.valueOf(abbrev.toUpperCase()));
        } catch (Exception e) {
            System.out.println("Team not found.");
        }


    }

    /**
     * PRINT THE FULL TEAM NAME
     * @param team Enum Passed into the print team
     */
    private static void printTeam(NFCMascot team) {
        System.out.println(team.getTeam());
    }


}
