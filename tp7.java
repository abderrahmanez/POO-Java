import java.util.Scanner;

public class tp7 {

    public static void main(String[] args) {
        
        // On crée un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        
        // On lit le nombre saisi par l'utilisateur
        int nombre = scanner.nextInt();

        // On ferme le scanner pour éviter les fuites de mémoire
        scanner.close();
        
        // On initialise la somme à 0
        int somme = 0;
        
        // On parcourt les entiers de 1 à nombre, en les ajoutant à la somme
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }
        
        // On affiche le résultat
        System.out.println("La somme des entiers jusqu'a " + nombre + " est : " + somme);
    }

}

// Explication du code :
//     On commence par importer la classe Scanner depuis le package java.util, pour pouvoir lire l'entrée utilisateur.
//     On crée une classe SommeDesEntiers avec une méthode main() qui est le point d'entrée du programme.
//     Dans la méthode main(), on crée un objet Scanner pour lire l'entrée utilisateur à partir de System.in (la console).
//     On demande à l'utilisateur de saisir un nombre entier positif en affichant un message à l'écran avec la méthode print().
//     On lit le nombre saisi par l'utilisateur avec la méthode nextInt() de l'objet Scanner.
//     On ferme le scanner pour libérer les ressources avec la méthode close().
//     On initialise la variable somme à 0.
//     On parcourt les entiers de 1 à nombre inclus avec une boucle for, et à chaque itération, on ajoute l'entier courant à la somme.
//     Enfin, on affiche le résultat en concaténant la chaîne de caractères "La somme des entiers jusqu'à " avec le nombre saisi par l'utilisateur, suivi de la chaîne " est : " et de la valeur de la variable somme. On utilise la méthode println() pour afficher le résultat suivi d'un saut de ligne.