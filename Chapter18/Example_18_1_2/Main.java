package Example_18_1_2;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try(FileReader fr = new FileReader("Chapter18/Example_18_1_2/data.txt")){
            int input = fr.read();
            while(input != -1) {
                System.out.print((char)input);
                input = fr.read();
            }
        }catch(Exception e){
            System.out.println("Some kind of error has occured");
        }
    }
}
