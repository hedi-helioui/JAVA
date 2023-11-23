package tn.esprit.gestionzoo.entities;

import javax.management.InvalidAttributeValueException;

public class Zoo extends Animal {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int nbrCages = 25;
    int nbrAnimals;
    private int nbrAquatic;
    private Animal[] AquaticAnimals = new Animal[10];

    public int getNbrAquatic() {
        return nbrAquatic;
    }

    public void setNbrAquatic(int nbrAquatic) {
        this.nbrAquatic = nbrAquatic;
    }

    public Animal[] getAquaticAnimals() {
        return AquaticAnimals;
    }

    public void setAquaticAnimals() {
        this.AquaticAnimals = AquaticAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "")
            System.out.println("le nom ne doit pas etre vide");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Zoo() {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }

    public void displayZoo() {
        System.out.println("name:" + name + "\ncity:" + city + "\nnombre de cages:" + nbrCages);
    }

    @Override
    public String toString() {
        return "name:" + name + "\ncity:" + city + "\nnombre de cages:" + nbrCages;
    }

    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {

        if (searchAnimal(animal) != -1) {
            throw new ZooFullException("l'animal n'existe pas");
        }
        if (nbrAnimals == nbrCages) {
            throw new ZooFullException("les cages sont pleinnes");
        }
        if (animal.getAge()<0){
           throw new InvalidAgeException("l'age ne doit pas etre negatif");
        }


        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.getName()+" added successfully!");;
        System.out.println("number of animals :"+nbrAnimals);
            }


    public int searchAnimal(Animal animal) {
        int x = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return x;
    }

    public void afficherAnimals() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }

    public boolean removeAnimal(Animal animal) {
        int x = searchAnimal(animal);
        if (x == -1)
            return false;
        else
            for (int i = x; i < nbrAnimals; i++) {
                animals[i] = animals[i + 1];
                animals[nbrAnimals] = null;
                this.nbrAnimals--;
            }
        return true;
    }

    public boolean isZooFull() {
        if (nbrCages == nbrAnimals)
            return false;
        else
            return true;

    }

    public Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals < z2.nbrAnimals)
            return z2;
        return z1;

    }

    public void addAquaticAnimals(Aquatic aquatic) {
        if (nbrAquatic > 10)
            System.out.println("les cages sont pleines");
        else
            AquaticAnimals[nbrAquatic]=aquatic;
        System.out.println("les animaux aquatics :"+ aquatic.getName());
        nbrAquatic++;
    }
    public float maxPenguinSwimmingDepth () {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquatic; i++) {
            if (AquaticAnimals[i] instanceof Penguin penguin  ) {
                if (maxDepth < penguin.getSwimmingDepth())
                    maxDepth = penguin.getSwimmingDepth();
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int nombredolphin=0;
        int nombrepenguin=0;
        for(int i=0 ;i<nbrAquatic;i++ ){
            if (AquaticAnimals[i] instanceof Dolphin){
                nombredolphin++;}
            if (AquaticAnimals[i] instanceof Penguin){
                nombrepenguin++;}
            System.out.println("le zoo" +name+"contion"+nombredolphin+"dauphinns et "+nombrepenguin+"pingouins ");
        }
    }

}
