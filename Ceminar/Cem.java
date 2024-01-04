package Ceminar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Cem {
    public static void main(String[] args) {

        herosWrite = generadComand(0);
        herosBlack = generadComand(3);

        herosWrite.forEach(n->System.out.println(n.toString()));
        System.out.println("***********");
        herosBlack.forEach(n->System.out.println(n.toString()));
    }

    static ArrayList<Hero> herosWrite = new ArrayList<>();
    static ArrayList<Hero> herosBlack = new ArrayList<>();

    static ArrayList<Hero> generadComand(int n){
        ArrayList<Hero> comandHeros = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1,5)+ n;
            switch (rand) {
                case 1:
                comandHeros.add(new Crossbower(getName()));
                break;
                case 2:
                comandHeros.add(new Rogue(getName()));
                break;
                case 3:
                comandHeros.add(new Monk(getName()));
                break;
                case 4:
                comandHeros.add(new Peasant(getName()));
                break;
                case 5:
                comandHeros.add(new Sniper(getName()));
                break;
                case 6:
                comandHeros.add(new Wizard(getName()));
                break;
                case 7:
                comandHeros.add(new Pikeman(getName()));
                break;
            }       
        }
        return comandHeros;
    }
    static String getName(){
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length -1)].name();
    }
}
