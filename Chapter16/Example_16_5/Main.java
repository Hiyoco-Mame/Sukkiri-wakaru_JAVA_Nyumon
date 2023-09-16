package Example_16_5;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Set<String> words = new TreeSet<String>();
        words.add("dog");
        words.add("cat");
        words.add("bird");
        words.add("frog");
        for (String s : words){
            System.out.print(s + "->");
        }
    }
}
