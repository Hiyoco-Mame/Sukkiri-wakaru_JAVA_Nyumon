package Example_17_10;

import java.io.*;

public class Main {
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("data.txt");){
            fw.write("hellow!");
        } catch (Exception e){
            System.out.println("Some kind of Error has occured.");
        }
    }
}
