package Practice_Java_13_1;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int)(basePoint * this.wand.power);
        h.setHp(h.getHp() + recovPoint);
        System.out.println("Recover" + h.getName() + "s HP by" + recovPoint);
    }
}
