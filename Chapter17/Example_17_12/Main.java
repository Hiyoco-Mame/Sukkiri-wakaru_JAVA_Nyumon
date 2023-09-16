package Example_17_12;

public class Main {
    public static void main(String[] args){
        try{
            throw new UnsupportedMusicFileException("File not supported");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
