//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package tn.esprit.gestionzoo.entities;

public interface Omnivore<T> extends Carnivor<T>, Herbivore<T> {
    void eatPlantAndMeet(T var1);
}
