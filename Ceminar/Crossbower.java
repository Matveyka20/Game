package Ceminar;

import Ceminar.InterFace.Shooter;

import java.util.Random;

public class Crossbower extends Hero{
    public Crossbower(String nameHero, int X, int Y){
        super(  75,75,2,new int[]{10,15}, nameHero, X, Y);
        rangeMaxDamage = 4;
        quantityShots = 5;
        Vector2 position;
    }

    protected int rangeMaxDamage;
    Random random = new Random();
    protected int quantityShots;


    @Override
    public String toString(){
        return "Арбалетчик: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor ;
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
