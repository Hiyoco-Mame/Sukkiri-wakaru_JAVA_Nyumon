package Example_16_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        for(String s : colors){
            System.out.print(s + "->");
        }
    }
}