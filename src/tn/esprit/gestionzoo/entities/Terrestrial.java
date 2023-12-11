package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrlegs ;

    public Terrestrial (){}
    public Terrestrial (String family,String name,int age ,boolean isMammal,int nbrlegs){
        super(family, name, age, isMammal);
        this.nbrlegs=nbrlegs;
    }
    public void eatPlant(Food plant) {
        if (plant != Food.PLANT && plant != Food.BOTH) {
            System.out.println("The animal is not terrestrial");
        } else {
            System.out.println("The animal is terrestrial");
        }

    }

    public void eatMeat(Food meat) {
        if (meat != Food.MEAT && meat != Food.BOTH) {
            System.out.println("The animal is not aquatic");
        } else {
            System.out.println("The animal is aquatic");
        }

    }

    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println("The animal is eating meat and plants");
        } else {
            System.out.println("The animal can't be eating just one type of food");
        }

    }
public String toString(){
        return super.toString() +  "nbrlegs: " + nbrlegs;
}
}
