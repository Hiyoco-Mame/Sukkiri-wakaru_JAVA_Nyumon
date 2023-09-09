package Example_15_9;

public class Main{
    public static void main(String[] args){
        Hero hero = new Hero();
        hero.setName("Madao");
        hero.setJob("Neet");
        hero.setGold(5);

        final String FORMAT = "%-8s %-8s 所持金%d";
        String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
        System.out.println(s);
    }
}
