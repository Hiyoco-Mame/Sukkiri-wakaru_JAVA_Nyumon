package Practice_Java_14_2;

import java.util.Random;

public class Cleric {
    private String name;
    private int hp;
    static final int maxHp = 50;
    private int mp;
    static final int maxMp = 10;

    public void selfAid(){
        if(this.mp > 5){
            this.mp -= 5;
            this.hp = this.maxHp;
            System.out.println("HPが最大値まで回復した！");
            }
        else{
            System.out.println("MPが足りない！");
        }
    }

    public int pray(int sec){
        Random rand = new Random();
        int recover = rand.nextInt(3) + sec;

        int recovery = Math.min(this.maxMp - this.mp, recover);
        this.mp += recovery;
        System.out.println("MPが" + recovery + "回復した！");
        return recovery;
        }
}
