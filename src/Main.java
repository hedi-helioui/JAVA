import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
         System.out.println(zm.zooName + " comporte " + zm.nbrCages) ;
    Scanner sc = new Scanner(System.in);
    System.out.println("saisir le nbr de cage souhaite");
    int nbrCageSaisie = sc.nextInt() ;
    ZooManagement zm1 = new ZooManagement();
    zm1.nbrCages = nbrCageSaisie;
        System.out.println(zm.zooName + " comporte " + zm1.nbrCages);
    }
}