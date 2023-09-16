package Practice_Java_12_3;

public class Main {
    public static void main(String[] args){
        Y[] arry = new Y[2];

        arry[0] = new A();
        arry[1] = new B();

        for(Y y:arry){
         y.b();
        }
    }
}
