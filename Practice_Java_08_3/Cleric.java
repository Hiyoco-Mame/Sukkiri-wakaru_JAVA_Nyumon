package Practice_Java_08_3;

public class Cleric {
    private String name;
    private int hp;
    private int maxHp = 50;
    private int mp;
    private int maxMp = 10;

    public void selfAid(){
        if(this.mp > 5){
            this.mp -= 5;
            this.hp = this.maxHp;
            System.out.println("HPが最大まで回復した！");
        }
        else{
            System.out.println("MPが足りない！");
        }
    }
}
