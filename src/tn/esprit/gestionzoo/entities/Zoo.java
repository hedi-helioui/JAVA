package tn.esprit.gestionzoo.entities;

public class Zoo extends Animal {
private Animal [] animals ;
private String name ;
private String city ;
private static final int nbrCages =25 ;
int nbrAnimals;

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
        if(name=="")
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
  public  void displayZoo(){
        System.out.println("name:"+ name +"\ncity:"+ city + "\nnombre de cages:"+ nbrCages );
    }

    @Override
    public String toString() {
        return "name:"+ name +"\ncity:"+ city + "\nnombre de cages:"+ nbrCages ;}

    public boolean addAnimal(Animal animal) {
        boolean b = isZooFull();
        if (b==false){
            System.out.println("zoo FULL");
        }
        else
if ( searchAnimal(animal) != -1){
    return false ;}
if (nbrAnimals==nbrCages){
    return false;}

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }


   public int searchAnimal(Animal animal)
    { int x=-1;
        for (int i=0;i< nbrAnimals ;i++) {
            if (animal.getName() == animals[i].getName())
        return i; }
    return x;
    }

public void afficherAnimals(){
        for (int i=0 ;i<animals.length;i++)
        {
            System.out.println(animals[i]);
        }
}
 public boolean removeAnimal(Animal animal){
    int x=searchAnimal(animal);
        if ( x == -1 )
            return false ;
        else
            for (int i=x ; i< nbrAnimals; i++)
            {
                animals[i]= animals[i+1];
                animals[nbrAnimals]=null ;
                this.nbrAnimals-- ;
                }
return true ;
}
   public boolean isZooFull(){
    if (nbrCages==nbrAnimals)
        return false;
    else
        return true ;

    }
   public Zoo comparerZoo(Zoo z1, Zoo z2){
    if (z1.nbrAnimals< z2.nbrAnimals)
        return z2;
    return z1;

    }
}
