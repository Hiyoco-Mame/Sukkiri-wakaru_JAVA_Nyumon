package Example_18_1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
            FileReader fr = new FileReader("Chapter18/Example_18_1/data.txt");
            int input = fr.read();
            while (input != -1){
                System.out.print((char)input);
                input = fr.read();
        }
            fr.close();
    }
}
