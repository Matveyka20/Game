package Ceminar;

public class Monk extends Hero{
    public Monk(String nameHero, int X, int Y){
        super(  50,50,1,new int[]{-35,-30}, nameHero, X, Y);

    }
    protected Vector2 position;

    @Override
    public String toString(){
        return "Монах: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }
}
