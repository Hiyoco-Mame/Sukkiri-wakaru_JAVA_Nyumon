package Example_17_8;

import java.io.*;

public class Main {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("data.txt");
            fw.write("Hello!");
        }catch(IOException e){
            System.out.println("Error has occured!");
        }finally{
            try{
            fw.close();
            } catch (IOException e){
                ;
            }
        }
    }
}
