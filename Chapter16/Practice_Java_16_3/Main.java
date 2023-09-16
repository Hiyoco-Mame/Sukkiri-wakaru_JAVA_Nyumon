package Practice_Java_16_3;

import java.util.Map;
import java.util.HashMap;
import java.lang.Integer;

public class Main {
    public static void main(String[] args){
        Hero h1 = new Hero("Saito");
        Hero h2 = new Hero("Suzuki");
        
        Map<Hero, Integer> heros = new HashMap<Hero, Integer>();

        heros.put(h1, 3);
        heros.put(h2, 7);

        String FORMAT = "Enemies defeated by %-8s = %3d";

        for(Hero h : heros.keySet()){
            String f = String.format(FORMAT, h.getName(), heros.get(h));
            System.out.println(f);
        }        
    }
}
