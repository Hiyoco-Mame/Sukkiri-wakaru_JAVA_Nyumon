package Practice_Java_14_1;

public class Account {
    private String accountNumber;
    private int balance;

    public String toString(){
        return "￥" + this.balance + "(口座番号：" + this.accountNumber +")";
    }

    public String getAccountNum(){return this.accountNumber;}
    public int getBalance(){return this.balance;}
    public void setAccountNum(String accountNumber){this.accountNumber = accountNumber;}
    public void setBalance(int balance){this.balance = balance;}

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Account){
            Account a = (Account) o;
            String an1 = accountNumber.trim();
            String an2 = a.accountNumber.trim();
            if(an1 == an2){
                return true;
            }
        }
        return false;
    }
}
