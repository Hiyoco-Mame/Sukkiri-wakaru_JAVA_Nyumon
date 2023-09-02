package Practice_Java_14_1;

public class Main {
    public static void main(String[] args){
        Account act1 = new Account();
        String num1 = "1111";
        int bal1 = 11111;
        act1.setAccountNum(num1);
        act1.setBalance(bal1);

        Account act2 = new Account();
        String num2 = "  1111";
        act2.setAccountNum(num2);

        System.out.println(act1.equals(act2));
        System.out.println(act1.toString());
    }
}
