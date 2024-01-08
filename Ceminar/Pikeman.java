package Ceminar;

import java.util.Random;

public class Pikeman extends Hero{
    public Pikeman(String nameHero, int X, int Y){
        super(  100,100,5,new int[]{20,30}, nameHero, X, Y);

    }
    protected Vector2 possition;
    Random random = new Random();

    @Override
    public String toString(){
        return "Пикенёр: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }

    @Override
    public void getDamage(Hero target) {
        if (this.position.rangeToEnemy(target.position) == 1){
            target.healt = target.healt - random.nextInt(damage[0],damage[1]);
        }
    }
}
