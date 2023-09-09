package Example_15_2;

public class Main {
    public static void main(String[] args){
        String s1 = "Java and JavaScript";
        if(s1.contains("Java")){
            System.out.println("文字列s1は、Javaを含んでいます。");
        }
        if(s1.endsWith("Java")){
            System.out.println("文字列s1は、末尾がJava");
        }
        else ;
    
        System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
        System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
    }

}
