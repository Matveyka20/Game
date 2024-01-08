package Ceminar;

import java.util.ArrayList;
import java.util.Collections;


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

    public float findMinDistance(ArrayList<Hero> enemys){
        ArrayList<Float> distances = new ArrayList<>();
        enemys.forEach(n-> distances.add(position.rangeToEnemy(n.position)));
        float minDistance = Collections.min(distances);
        return minDistance;
    }
    public Hero findNearestEnemy(ArrayList<Hero> enemys){
        Hero heroTMP = enemys.get(0);
        for (int i = 0; i < enemys.size(); i++) {
            if (this.position.rangeToEnemy(enemys.get(i).position) < this.position.rangeToEnemy(heroTMP.position)){
                heroTMP = enemys.get(i);
            }
        }
        return heroTMP;
    }
}

