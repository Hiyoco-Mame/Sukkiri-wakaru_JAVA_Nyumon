package Example_15_1;

public class Main {
    public static void main(String[] args){
        String s1 = "Sukkiri-Java";
        String s2 = "Java";
        String s3 = "java";
        if(s2.equals(s3)){
            System.out.println("s2 and s3 are same");
        }
        if(s2.equalsIgnoreCase(s3)){
            System.out.println("s2 and s3 are same if cases are ignored");
        }
        else{};

        System.out.println("Lenght of s1 is " + s1.length() + ".");

        if(s1.isEmpty()){
            System.out.println("s1 is empty.");
        }
    }
}
