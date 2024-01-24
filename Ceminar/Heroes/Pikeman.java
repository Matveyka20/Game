package Ceminar.Heroes;

import Ceminar.TipeOfHeroes.MeleeHero;
import Ceminar.Vector2;

public class Pikeman extends MeleeHero {

    public Pikeman(String nameHero, int posX, int posY) {
        super(100, 100, 5, new int[]{30, 40}, nameHero, posX, posY, 1);
        Vector2 position;
    }

    @Override
    public String toString() {
        return ("Копейщик: " + super.toString());
    }
    @Override
    public String getInfo() {
        return "Копейщик";
    }
}