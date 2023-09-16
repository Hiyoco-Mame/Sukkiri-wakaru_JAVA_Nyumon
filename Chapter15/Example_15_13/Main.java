package Example_15_13;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
        Date d = f.parse("2023/09/10-12:15:32");
        System.out.println(d);

        Date now = new Date();
        String s = f.format(now);
        System.out.println(s);
    }
}
