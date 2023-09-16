package Example_16_2;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<String>();
        name.add("Minato");
        name.add("Asaka");
        name.add("Sugawara");
        Iterator<String> it = name.iterator();

        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}
