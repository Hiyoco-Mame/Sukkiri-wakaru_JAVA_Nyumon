package Practice_Java_11_4;

public class TangibleAsset extends Asset implements Thing{
    String color;
    double weight;
    
    public TangibleAsset(String name, int price, String color){
        super(name, price);
        this. color = color;
    }

    public String getColor()        {return this.color;}
    public double getWeight()       {return this.weight;}
    public void setWeight(double kg){this.weight = kg;}
}