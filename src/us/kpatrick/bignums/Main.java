package us.kpatrick.bignums;
import java.math.BigDecimal;
/**
 * CLASS FOR CALCULATING THE NUMBER OF COPYS OF LETTERS TO TEXANS FROM CALIFORNIANS WRITTEN BY WISCONSINITES
 * @author kpatr
 * @version 1.0.0
 */
public class Main {
    private static double COPY_RATE = 3.23;
    private static double POP_WI = 5726398;
    private static double POP_CA = 38041430;
    private static double POP_TX = 26059203;

    /**
     * MAIN STARTING POINT OF THE PROGRAM
     * @param args INITIAL STARTING ARGUMENTS
     */
    public static void main(String[] args) {
        // write your code here
        BigDecimal bd1 = new BigDecimal(POP_WI);
        BigDecimal bd2 = new BigDecimal(POP_CA);
        BigDecimal bd3 = new BigDecimal(POP_TX);
        BigDecimal copyRate = new BigDecimal(COPY_RATE);
        System.out.println((bd2.multiply(bd2).multiply(bd3).multiply(copyRate).setScale(2,BigDecimal.ROUND_CEILING)));
    }
}