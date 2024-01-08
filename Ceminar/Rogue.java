package Ceminar;

public class Rogue extends Hero{
    public Rogue(String nameHero, int X, int Y){
        super(  100,100,5,new int[]{10,15}, nameHero, X, Y);

    }
    protected Vector2 possition;

    @Override
    public String toString(){
        return "Разбойник: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor ;
    }
}

