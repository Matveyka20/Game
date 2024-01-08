package Ceminar;

public class Sniper extends Hero{
    public Sniper(String nameHero, int X, int Y){
        super(  75,75,2,new int[]{10,15}, nameHero, X, Y);
        rangeMaxDamage = 4;

    }
    protected int rangeMaxDamage;
    protected Vector2 possition;

    @Override
    public String toString(){
        return "Снайпер: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor ;
    }
}
