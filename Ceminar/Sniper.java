package Ceminar;

import java.util.Random;

public class Sniper extends Hero{
    public Sniper(String nameHero, int X, int Y){
        super(  75,75,2,new int[]{10,15}, nameHero, X, Y);
        rangeMaxDamage = 4;

    }
    protected int rangeMaxDamage;
    protected Vector2 possition;
    Random random = new Random();
    protected int quantityShots;

    @Override
    public String toString(){
        return "Снайпер: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor ;
    }

    @Override
    public void getShoot(Hero target){
        if (quantityShots > 0) {
            if (this.position.rangeToEnemy(target.position) < rangeMaxDamage) {
                target.healt = target.healt - random.nextInt(damage[0], damage[1]);
            } else {
                target.healt = target.healt - damage[0];
            }
        }

    }

}
