package Example_18_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("Chapter18/Example_18_2/data.txt");
        fw.write('そ');
        fw.write('れ');
        fw.write('な');
        fw.write('!');
        fw.write('\n');
        fw.write("abc");
        fw.close();
    }
}
