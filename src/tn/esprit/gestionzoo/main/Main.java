//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tn.esprit.gestionzoo.main;

import java.util.Scanner;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Food;
import tn.esprit.gestionzoo.entities.Penguin;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le nbr de cages");
        int nbcages = sc.nextInt();
        zm.nbrCages = nbcages;
        System.out.println("le nbr de cages est :" + zm.nbrCages);
        Animal lion = new Animal();
        lion.setName("Lion");
        lion.setAge(2);
        lion.setFamily("slm");
        lion.setMammal(true);
        Animal tiger = new Animal();
        tiger.setName("Tiger");
        tiger.setAge(4);
        tiger.setFamily("slmmmm");
        tiger.setMammal(true);
        Zoo myZoo = new Zoo();
        myZoo.setName("belvedere");
        myZoo.setCity("tunis");
        myZoo.setAnimals(new Animal[nbcages]);
        System.out.println("donner le nbr des animaux aquatiques :\n");
        int nbaquatics = sc.nextInt();
        myZoo.setNbrAquatic(nbaquatics);
        System.out.println("le nbr des animaux aquatiques est :" + nbaquatics);

        try {
            myZoo.addAnimal(lion);
        } catch (Exception var21) {
            System.out.println("Error " + var21.getMessage());
        }

        try {
            myZoo.addAnimal(tiger);
        } catch (Exception var19) {
            System.out.println("Error " + var19.getMessage());
        } finally {
            System.out.println("passed");
        }

        Dolphin dolphin = new Dolphin("d", "salut", 2, false, "salut", 2.0F);
        Penguin penguin = new Penguin("p", "hola1", 4, true, "hola", 41.2F);
        Penguin penguin1 = new Penguin("pp", "hola2", 4, true, "hola", 51.3F);
        Penguin penguin2 = new Penguin("pp", "hola3", 4, true, "hola", 54.3F);
        Penguin penguin3 = new Penguin("pp", "hola4", 4, true, "hola", 33.3F);
        myZoo.addAquaticAnimals(dolphin);
        myZoo.addAquaticAnimals(penguin);
        myZoo.addAquaticAnimals(penguin1);
        myZoo.addAquaticAnimals(penguin2);
        myZoo.addAquaticAnimals(penguin3);
        penguin.swim();
        dolphin.swim();
        System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        Aquatic aquatic = new Aquatic("a1", "a2", 3, false, "salut") {
            public void swim() {
            }
        };
        Penguin penguin4 = new Penguin("d3", "dd", 5, true, "hh", 5.4F);
        Terrestrial terrestrial = new Terrestrial("hi", "hi", 12, false, 3);
        aquatic.eatMeat(Food.MEAT);
        penguin4.eatMeat(Food.MEAT);
        terrestrial.eatMeat(Food.MEAT);
        terrestrial.eatPlant(Food.MEAT);
        terrestrial.eatPlantAndMeet(Food.MEAT);
    }
}
