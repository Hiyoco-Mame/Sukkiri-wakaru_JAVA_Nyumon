package Example_17_3;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try{
            FileWriter fw= new FileWriter("data.txt");
            fw.write("hello!");
            fw.close();
        }catch (Exception e){
            System.out.println("Some kind of error occured");
        }
    }
}
