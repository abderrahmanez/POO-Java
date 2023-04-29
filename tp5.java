import java.util.Scanner;

public class tp5 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander l'âge de l'enfant
        System.out.print("Quel âge a l'enfant ? ");
        int age = scanner.nextInt();

        // Déterminer la catégorie de l'enfant en fonction de son âge
        String categorie;
        if (age >= 6 && age <= 7) {
            categorie = "Poussin";
        } else if (age >= 8 && age <= 9) {
            categorie = "Pupille";
        } else if (age >= 10 && age <= 11) {
            categorie = "Minime";
        } else if (age >= 12) {
            categorie = "Cadet";
        } else {
            categorie = "Âge non valide pour les catégories de l'enfant.";
        }

        // Afficher la catégorie de l'enfant
        System.out.println("La catégorie de l'enfant est : " + categorie);
    }
}

// Explication :
// Ce programme commence par importer la classe Scanner de Java pour permettre à l'utilisateur de saisir l'âge de l'enfant. Ensuite, le programme demande l'âge de l'enfant à l'utilisateur et stocke cette valeur dans une variable entière age.

// Le programme utilise ensuite une série de déclarations if/else if pour déterminer la catégorie appropriée pour l'enfant, en fonction de son âge. Si l'âge se situe entre 6 et 7 ans, la catégorie est "Poussin", si l'âge se situe entre 8 et 9 ans, la catégorie est "Pupille", et ainsi de suite. Si l'âge n'est pas compris dans ces tranches d'âge, le programme affiche un message indiquant que l'âge n'est pas valide pour les catégories d'enfant.

// Enfin, le programme affiche la catégorie appropriée pour l'enfant en fonction de son âge, en utilisant la méthode println pour afficher un message à l'utilisateur.