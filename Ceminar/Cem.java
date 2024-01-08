package Ceminar;


import java.util.ArrayList;
import java.util.Random;

public class Cem {
    public static void main(String[] args) {

        herosWrite = generadComand(0,0);
        herosBlack = generadComand(3,9);

        herosWrite.forEach(n->System.out.println(n.toString()));
        System.out.println("***********");
        herosBlack.forEach(n->n.printEnemyDis(herosWrite));
    }

    static ArrayList<Hero> herosWrite = new ArrayList<>();
    static ArrayList<Hero> herosBlack = new ArrayList<>();

    static ArrayList<Hero> generadComand(int n, int y){
        ArrayList<Hero> comandHeros = new ArrayList<>();
        Random random = new Random();
        int rand;

        for (int i = 0; i < 10; i++) {
            rand = random.nextInt(1,5)+ n;
            switch (rand) {
                case 1:
                comandHeros.add(new Crossbower(getName(),i,y));
                break;
                case 2:
                comandHeros.add(new Rogue(getName(),i,y));
                break;
                case 3:
                comandHeros.add(new Monk(getName(),i,y));
                break;
                case 4:
                comandHeros.add(new Peasant(getName(),i,y));
                break;
                case 5:
                comandHeros.add(new Sniper(getName(),i,y));
                break;
                case 6:
                comandHeros.add(new Wizard(getName(),i,y));
                break;
                case 7:
                comandHeros.add(new Pikeman(getName(),i,y));
                break;
            }       
        }
        return comandHeros;
    }
    static String getName(){
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length -1)].name();
    }


}
