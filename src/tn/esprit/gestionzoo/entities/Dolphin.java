package tn.esprit.gestionzoo.entities;

public class Dolphin  extends Aquatic{
    private float swimmingSpeed;

    public Dolphin (){}
    public Dolphin (String family ,String name ,int age , boolean isMammal ,String habitat ,float swimmingSpeed){
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed= swimmingSpeed;
    }
public String toString (){
        return "swimmingSpeed: "+ swimmingSpeed;
}
public void swim(){
    System.out.println("the dolphion is swimming ");
}
}
