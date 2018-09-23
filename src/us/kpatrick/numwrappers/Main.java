package us.kpatrick.numwrappers;

import java.util.Scanner;

/**
 * CLASS FOR NUMBER WRAPPERS
 * @author kpatr
 * @version 1.0.0
 */
public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    /**
     * program starting point
     * @param args initial arguments for program
     */
    public static void main(String[] args) {
        String minType = "Start";
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("Enter a Number");
        String n = keyboard.nextLine();

        if (tryParseByte(n)) {
            output("Byte");
        } else if (tryParseShort(n)) {
            output("Short");
        } else if (tryParseInt(n)) {
            output("Integer");
        } else if (tryParseLong(n)) {
            output("Long");
        } else if (tryParseFloat(n)) {
            output("Float");
        } else if (tryParseDouble(n)) {
            output("Double");
        } else {
            output("None Found");
        }
    }

    /**
     * output the Min DataType
     * @param minType String Type
     */
    private static void output(String minType) {
        System.out.println("The minimum data type is " + minType);
    }

    /**
     * check if double
     * @param value string
     * @return boolean true or false
     */
    private static boolean tryParseDouble (String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * check if float
     * @param value string
     * @return boolean true or false
     */
    private static boolean tryParseFloat (String value) {


        try {
            Float floatval = Float.parseFloat(value);
            if (floatval >= Float.MIN_VALUE && floatval <= Float.MAX_VALUE) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

    }
    /**
     * check if long
     * @param value string
     * @return boolean true or false
     */
    private static boolean tryParseLong(String value) {
        try {
            Long.parseLong(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * check if int
     * @param value string
     * @return boolean true or false
     */
    private static boolean tryParseInt (String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * check if short
     * @param value string
     * @return boolean true or false
     */
    private static boolean tryParseShort (String value) {
        try {
            Short.parseShort(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * check if Byte
     * @param value string
     * @return boolean true or false
     */
    private static boolean tryParseByte (String value) {
        try {
            Byte.parseByte(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
