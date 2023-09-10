package Example_16_7;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("Kyoto", 255);
        prefs.put("Tokyo", 1261);
        prefs.put("Kumamoto", 182);

        final String FORMAT = "Population of %-9s is %4d";

        for(String key : prefs.keySet()){
            String s = String.format(FORMAT, key, prefs.get(key));
            System.out.println(s);
        }
    }
}
