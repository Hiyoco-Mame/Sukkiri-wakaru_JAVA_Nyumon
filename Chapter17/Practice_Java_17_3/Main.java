package Practice_Java_17_3;

public class Main {
    public static void main(String[] args){
        try{
            int i;
            i = Integer.parseInt("三");
            System.out.println(i);
        }catch (NumberFormatException e){
        System.out.println("NumberFormatException例外をcatchしました.");
        }
    }
}