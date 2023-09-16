package Example_16_6;

import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("Kyoto", 255);
        prefs.put("Tokyo", 1261);
        prefs.put("Kumamoto", 181);
        int tokyo = prefs.get("Tokyo");
        System.out.println("Population of Tokyo is "+tokyo);
        System.out.println(prefs.size());

        prefs.remove("Kyoto");
        prefs.put("Kumamoto", 182);
        int kumamoto = prefs.get("Kumamoto");
        System.out.println("Population of Kumamoto is " + kumamoto);
        System.out.println(prefs.size());
    }
}
