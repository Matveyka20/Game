package Ceminar;

public class Peasant extends Hero{
    public Peasant(String nameHero, int X, int Y){
        super(  100,100,0,new int[]{0,0}, nameHero, X, Y);

    }

    protected Vector2 position;

    @Override
    public String toString(){
        return "Крестьянин: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }

    
}
