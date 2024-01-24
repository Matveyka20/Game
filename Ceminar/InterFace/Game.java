package Ceminar.InterFace;

import Ceminar.Hero;

import java.util.ArrayList;

public interface Game {
    void gameStep(ArrayList<Hero> teamEnemy, ArrayList<Hero> teamAllias);

}
