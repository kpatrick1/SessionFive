package us.kpatrick.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * PROGRAM DEALING WITH DATES
 * @author kpatr
 * @version  1.0.0
 */
public class Main {
    /**
     * starting point of program
     * @param args main starting args
     */
    public static void main(String[] args) {
        Date U2 = new Date(1987,Calendar.MARCH,9);
        Date rah = new Date(1988,Calendar.OCTOBER,10);

        DateFormat dateFormatter;
        dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);


        System.out.println(U2.getMonth()+1 + "/" + U2.getDate() + "/" + U2.getYear());
        System.out.println(rah.getMonth()+1 + "/" + rah.getDate() + "/" + rah.getYear());

        Long diff = rah.getTime() - U2.getTime();

        Long days = ((diff / 1000 / 60 /60 /24)+1);
        System.out.println(days);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, Integer.parseInt(days.toString()));
        String output = sdf.format(c.getTime());
        System.out.println(output);
    }

}
