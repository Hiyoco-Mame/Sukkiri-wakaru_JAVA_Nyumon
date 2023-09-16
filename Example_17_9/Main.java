package Example_17_9;

import java.io.*;

public class Main {
    public static void main(String[] args){
        FileWriter fw = null;
        try{
            fw = new FileWriter("data.txt");
        }catch (Exception e){
            System.out.println("Some kind of Error occureed");
        }finally{
            if(fw!=null){
                try{
                    fw.close();
                }
                catch (IOException e){
                ;
                }
            }
        }
    }
}