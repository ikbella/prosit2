import java.util.Scanner;
public class ZooManagment {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" entre le nom de zoo");
            zooName = sc.nextLine().trim();
        } while (zooName.isEmpty());
        do {
            System.out.println("entrele m brCage");
            while (!sc.hasNextInt()) {
                System.out.println("entre le mbrCage");
                sc.next();
            }
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);
        System.out.println(zooName + " comporte " + nbrCages + " cages");
        sc.close();


        Animal lion= new Animal("félidés","scar",12,true);
        Zoo myZoo= new Zoo("Belvédére","Tunis",25);
        myZoo.displayZoo();
        System.out.println(myZoo) ;//  nom de la class @adress memoire Java appelle automatiquement la méthode `toString()` de l'objet
        System.out.println(myZoo.toString()) ;//  nom de la class @adress memoire
        System.out.println(lion);

    }
}