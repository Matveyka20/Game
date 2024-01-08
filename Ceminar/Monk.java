package Ceminar;

import java.util.Random;

public class Monk extends Hero{
    public Monk(String nameHero, int X, int Y){
        super(  50,50,1,new int[]{-35,-30}, nameHero, X, Y);
        Vector2 position;
    }

     Random random = new Random();

    @Override
    public String toString(){
        return "Монах: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }

    @Override
    public void getHealing(Hero target) {
        target.healt = target.healt + random.nextInt(damage[0], damage[1]);
    }
}
