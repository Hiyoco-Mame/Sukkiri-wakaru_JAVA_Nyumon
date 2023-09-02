package Practice_Java_13_4;

public class Wand {
    private String name;
    private double power;

    public String getName()            {return this.name;}
    public double getPower()           {return this.power;}
    
    public void setName(String Name)   {
        if( (Name == null) || (Name.length() < 3) ){
            throw new IllegalArgumentException("Code 13-3");
        }
        else
            this.name = Name;
    }
    
    public void setPower(double Power) {
        if( (Power < 0.5) || (Power > 100)){
            throw new IllegalArgumentException("Code 13-3");
        }
        else
            this.power = Power;
    }
}
