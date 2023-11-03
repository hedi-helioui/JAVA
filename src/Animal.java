
public class Animal {
String family ;
String name ;
int age ;
boolean isMammal ;
    public Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    void displayAnimal() {
        System.out.println("name:"+ name + "\nage:"+ age+ "\nfamily:"+family+"\nisMammal:"+ isMammal);
    }
    @Override
    public String toString() {
        return "name:"+ name + "\nage:"+ age+ "\nfamily:"+family+"\nisMammal:"+ isMammal ;}

}
