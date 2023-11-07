package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrlegs ;

    public Terrestrial (){}
    public Terrestrial (String family,String name,int age ,boolean isMammal,int nbrlegs){
        super(family, name, age, isMammal);
        this.nbrlegs=nbrlegs;
    }
public String toString(){
        return super.toString() +  "nbrlegs: " + nbrlegs;
}
}
