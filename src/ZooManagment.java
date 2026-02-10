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
            System.out.println("entre le  nbrCage");
            while (!sc.hasNextInt()) {
                System.out.println("entre le nbrCage");
                sc.next();
            }
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);
        System.out.println(zooName + " comporte " + nbrCages + " cages");
        sc.close();

// prosit 2
        Animal lion= new Animal("félidés","scar",6,true);
        Zoo myZoo= new Zoo("Belvédére","Tunis");
        myZoo.displayZoo();
        System.out.println(myZoo) ;//  nom de la class @adress memoire Java appelle automatiquement la méthode `toString()` de l'objet
        System.out.println(myZoo.toString()) ;//  nom de la class @adress memoire
        System.out.println(lion);

        //prosit3
        Animal tigre = new Animal("Felidae", "Shere Khan", 4, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal serpent = new Animal("Reptiles", "Kaa", 3, false);
        Animal zebre = new Animal("Equidae", "Marty", 6, true);
        Animal girafe = new Animal("Giraffidae", "Melman", 7, true);


        myZoo.addAnimal(lion);
        myZoo.addAnimal(tigre);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(serpent);
        myZoo.addAnimal(zebre);
        myZoo.addAnimal(girafe);// lajout de 6eme animale affiche le tableau est plein pour un tableau de 5 cases

        myZoo.afficheAnimal();
        int index= myZoo.searchAnimal(lion);
        if(index!=-1){
            System.out.println(lion.name+" trouvé à la cage " + index);

        }else {
            System.out.println(" lanimle non trouvé");
        }
        Animal lion2 = new Animal("Felidae", "scar", 6, true);
        boolean result1=myZoo.removeAnimal(tigre);
        myZoo.afficheAnimal();

        Zoo zoo1 = new Zoo("Safari Park", "Tunis");
        Zoo zoo2 = new Zoo("Jungle Adventure", "Sousse");
        Zoo zoo3 = new Zoo("Wildlife Reserve", "Sfax");

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(elephant);

        System.out.println("Animaux dans zoo1 : " + zoo1.getNombreAnimaux() + "/" + Zoo.NBRCAGES);

        Animal panthere = new Animal("Felidae", "Bagheera", 6, true);
        Animal ours = new Animal("Ursidae", "Baloo", 9, true);
        Animal singe = new Animal("Cercopithecidae", "Rafiki", 15, true);

        zoo2.addAnimal(panthere);
        zoo2.addAnimal(ours);
        zoo2.addAnimal(singe);
        System.out.println("Animaux dans zoo2 : " + zoo2.getNombreAnimaux() + "/" + Zoo.NBRCAGES);

        Zoo plusGrand1 = Zoo.comparerZoo(zoo1, zoo2);
        Zoo plusGrand2 = Zoo.comparerZoo(zoo2, zoo3);



    }
}