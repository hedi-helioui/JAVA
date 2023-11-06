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

        myzoo.addAnimal(lion);
        myzoo.addAnimal(cat);
        myzoo.afficherAnimals();
        System.out.println(myzoo.searchAnimal(cat));
        System.out.println(myzoo.searchAnimal(lion));
        System.out.println(myzoo.removeAnimal(lion));

    }
}