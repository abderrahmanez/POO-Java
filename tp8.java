import java.util.Scanner;

public class tp8 {

    public static void main(String[] args) {

        // Création d'un objet Scanner pour la saisie utilisateur
        Scanner sc = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre
        System.out.println("Veuillez saisir un nombre : ");
        int n = sc.nextInt();

        // Initialisation de la variable F à 1
        int f = 1;

        // Calcul de la factorielle en utilisant une boucle for
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }

        // Affichage du résultat
        System.out.println("La factorielle de " + n + " est : " + f);

        // Fermeture de l'objet Scanner
        sc.close();
    }
}

// Explications :
//     Tout d'abord, nous importons la classe Scanner du package java.util pour pouvoir utiliser la méthode Scanner.
//     Nous créons une classe nommée "Factorielle".
//     Dans la méthode "main", nous créons un objet Scanner "sc" pour permettre à l'utilisateur de saisir un nombre.
//     Nous demandons à l'utilisateur de saisir un nombre en affichant le message "Veuillez saisir un nombre : ".
//    Nous stockons le nombre saisi par l'utilisateur dans une variable "n".
//     Nous initialisons la variable "f" à 1 car tout nombre multiplié par 1 reste inchangé.
//     Nous utilisons une boucle for pour calculer la factorielle du nombre saisi par l'utilisateur en multipliant chaque nombre de 1 à "n" ensemble.
//     Nous affichons le résultat en utilisant la méthode println() qui affiche le texte "La factorielle de " suivi du nombre saisi par l'utilisateur, suivi de " est : " et enfin suivi de la variable "f" qui contient la factorielle calculée.
//     Nous fermons l'objet Scanner "sc" pour éviter toute fuite de mémoire.