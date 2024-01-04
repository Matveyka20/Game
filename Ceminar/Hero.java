package Ceminar;


public abstract class Hero {
    protected int healt, healtMax, armor;
    int [] damage;
    String nameHero;


    public Hero(int healt, int healtMax, int armor, int [] damage, String nameHero){
        this.healt = healt;
        this.healtMax = healtMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
    }


}

