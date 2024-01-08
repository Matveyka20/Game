package Ceminar;

import java.util.ArrayList;

public abstract class Hero {
    protected int healt, healtMax, armor;
    protected Vector2 position;
    int [] damage;
    String nameHero;


    public Hero(int healt, int healtMax, int armor, int [] damage, String nameHero, int X, int Y){
        this.healt = healt;
        this.healtMax = healtMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(X,Y);
    }

    public void printEnemyDis(ArrayList<Hero> enemys){
        enemys.forEach(n->System.out.print(position.rangeToEnemy(n.position)+", "));
        System.out.println();
    }


}

