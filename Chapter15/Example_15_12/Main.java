package Example_15_12;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2023,9,10,12,10,32);
        c.set(Calendar.MONTH, 10);
        
        Date d = c.getTime();
        System.out.println(d);

        Date now = new Date();
        c.setTime(now);
        int y = c.get(Calendar.YEAR);
        System.out.println("This year is " + y + ".");
    }
}
