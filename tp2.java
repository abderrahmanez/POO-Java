import java.util.Scanner;

public class tp2{

    public static void main(String[] args) {
        
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre : ");
        
        // Lire le nombre de l'utilisateur
        double nombre = scanner.nextDouble();
        
        // Calculer le carré du nombre
        double carre = nombre * nombre;
        
        // Afficher le résultat
        System.out.println("Le carre de " + nombre + " est : " + carre);
    }
}

// Explication :

//     Nous importons la classe Scanner de la bibliothèque standard de Java pour pouvoir lire l'entrée de l'utilisateur.
//     Nous créons une classe appelée SquareCalculator pour contenir notre code.
//     Nous définissons une méthode principale, qui est le point d'entrée de notre programme.
//     Nous créons un objet Scanner et l'initialisons pour lire l'entrée de l'utilisateur à partir de System.in.
//     Nous demandons à l'utilisateur d'entrer un nombre en utilisant System.out.print.
//     Nous lisons le nombre que l'utilisateur a entré en utilisant scanner.nextDouble().
//     Nous calculons le carré du nombre en multipliant le nombre par lui-même.
//     Nous affichons le résultat en utilisant System.out.println, en utilisant la concaténation de chaînes pour inclure le nombre d'origine et le carré dans le message.