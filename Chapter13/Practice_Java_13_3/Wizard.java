package Practice_Java_13_3;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h){
        int basePoint = 10;
        int recovPoint = (int)(basePoint * wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println("Recover" + h.getName() + "s HP by" + recovPoint);
    }

    public int getHp()      {return this.hp;}
    public int getMp()      {return this.mp;}
    public String getName() {return this.name;}
    public Wand getWand()   {return this.wand;}

    public void setHp(int Hp)           {this.hp = Hp;}
    public void setMp(int Mp)           {this.mp = Mp;}
    public void setName(String Name)    {this.name = Name;}
    public void setWand(Wand Wand)      {this.wand = Wand;}

}
