package Ceminar;

public class Rogue extends Hero{
    public Rogue(String nameHero){
        super(  100,
                100,
                5,
                new int[]{10,15}, nameHero);
    }

    @Override
    public String toString(){
        return "Разбойник: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor ;
    }
     

}

