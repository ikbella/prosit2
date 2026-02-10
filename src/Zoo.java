import java.util.Scanner;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    static final int NBRCAGES = 25;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBRCAGES];
    }

    public void displayZoo() {
        System.out.println("le nom du Zoo est :" + name);
        System.out.println("le city du Zoo est :" + city);
        System.out.println(" le nombre des cages est :" + NBRCAGES);
    }

    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBRCAGES +
                '}';
    }
//prosit3
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println(animal.name + " est déjà dans le zoo !");
            return false;
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                animals[i] = animal;
                System.out.println(animal.name + " a été ajouté au zoo avec succès !");
                return true;
            }
        }
        System.out.println("le tableau est plein");
        return false;

    }

    public void afficheAnimal() {
        System.out.println(" Animaux du " + name + " ");

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                System.out.println("Cage " + i + ": " + animals[i].toString());
            }
        }

    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        System.out.println("l animal nexiste pas dans le tableau");
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println(animal.name + " 'est pas dans le zoo !");
            return false;
        }
        animals[index] = null;
        for (int i = index; i < animals.length - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animals.length - 1] = null;
        System.out.println(animal.name + " a été retiré avec succès !");
        return true;

    }

    public boolean isZooFull() {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
            }
        }

        return count >= NBRCAGES;
    }


    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        int count1 = 0;
        for (int i = 0; i < zoo1.animals.length; i++) {
            if (zoo1.animals[i] != null) {
                count1++;
            }
        }
        int count2 = 0;
        for (int i = 0; i < zoo2.animals.length; i++) {
            if (zoo2.animals[i] != null) {
                count2++;
            }
        }
        if (count1 > count2) {
            System.out.println(zoo1.name + " a le plus d'animaux !\n");
            return zoo1;
        } else if (count2 > count1) {
            System.out.println(zoo2.name + " a le plus d'animaux !\n");
            return zoo2;
        } else {
            System.out.println(" Les deux zoos ont le même nombre d'animaux !\n");
            return zoo1;
        }
    }
    public int getNombreAnimaux() {
        int count = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                count++;
            }
        }
        return count;
    }

}



