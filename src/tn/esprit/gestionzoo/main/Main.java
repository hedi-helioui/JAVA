package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    ZooManagement zm = new ZooManagement();
    System.out.println(zm.zooName + " comporte " + zm.nbrCages) ;
    Scanner sc = new Scanner(System.in);
    System.out.println("saisir le nbr de cage souhaite");
    int nbrCageSaisie = sc.nextInt() ;
    ZooManagement zm1 = new ZooManagement();
    zm1.nbrCages = nbrCageSaisie;
    System.out.println(zm.zooName + " comporte " + zm1.nbrCages);

        System.out.println("------------------------------------------------------------------");

    Animal lion = new Animal();
    Animal cat = new Animal();
    lion.setName("lotfi");
    lion.setAge(4);
    lion.setFamily("azerty");
    lion.setMammal(true);
    Zoo myzoo =new Zoo();
    myzoo.setAnimals(new Animal[nbrCageSaisie]);
    myzoo.setName("ichkil");
    myzoo.setCity("tunis");

// myzoo.nbrCages= 25;
//  myzoo.displayZoo();
//  System.out.println(myzoo);
//System.out.println(myzoo.toString());
//lion.displayAnimal();
// System.out.println(lion);
//System.out.println(lion.toString());
        System.out.println("------------------------------------------------------------------");

        myzoo.addAnimal(lion);
        myzoo.addAnimal(cat);
        myzoo.afficherAnimals();
        System.out.println(myzoo.searchAnimal(cat));
        System.out.println(myzoo.searchAnimal(lion));
        System.out.println(myzoo.removeAnimal(lion));

        System.out.println("------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------");

        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
    Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea");
    Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
    Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

    aquatic.swim();
    dolphin.swim();
    penguin.swim();




    }
}