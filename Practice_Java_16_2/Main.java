package Practice_Java_16_2;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Hero> list = new ArrayList<Hero>();
        Hero hSaito = new Hero("Saito");
        Hero hSuzuki = new Hero("Suzuki");

        list.add(hSaito);
        list.add(hSuzuki);

        for(Hero s : list){
            System.out.println(s.getName());
        }
    }
}
