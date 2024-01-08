package Ceminar;

public class Wizard extends Hero{
    public Wizard(String nameHero, int X, int Y){
        super(  50,50,1,new int[]{-35,-30}, nameHero, X, Y);

    }
    protected Vector2 possition;

    @Override
    public String toString(){
        return "Колдун: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }
}
