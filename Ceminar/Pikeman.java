package Ceminar;

public class Pikeman extends Hero{
    public Pikeman(String nameHero, int X, int Y){
        super(  100,100,5,new int[]{20,30}, nameHero, X, Y);

    }
    protected Vector2 possition;

    @Override
    public String toString(){
        return "Пикенёр: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }
}
