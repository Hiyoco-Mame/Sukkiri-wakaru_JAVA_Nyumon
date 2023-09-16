package Example_16_3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        System.out.println("Number of colors are " + colors.size());
    }
}
