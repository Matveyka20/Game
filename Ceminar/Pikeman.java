package Ceminar;

public class Pikeman extends Hero{
    public Pikeman(String nameHero){
        super(  100,
                100,
                5,
                new int[]{20,30}, nameHero);
    }

    @Override
    public String toString(){
        return "Пикенёр: " +nameHero+ " " + "Здоровье: " + healt+ "/"+healtMax+ " Броня: " +armor;
    }
}
