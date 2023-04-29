import java.util.Scanner;

public class tp9 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le nombre de notes
        System.out.print("Combien de notes voulez-vous saisir ? ");
        int nombreNotes = scanner.nextInt();

        // Créer un tableau pour stocker les notes
        int[] notes = new int[nombreNotes];

        // Demander à l'utilisateur de saisir les notes et les stocker dans le tableau
        for (int i = 0; i < nombreNotes; i++) {
            System.out.print("Entrez la note N" + (i + 1) + " : ");
            notes[i] = scanner.nextInt();
        }

        // Calculer la moyenne des notes
        double somme = 0;
        for (int note : notes) {
            somme += note;
        }
        double moyenne = somme / nombreNotes;

        // Compter le nombre de notes supérieures à la moyenne
        int nombreNotesSuperieures = 0;
        for (int note : notes) {
            if (note > moyenne) {
                nombreNotesSuperieures++;
            }
        }

        // Afficher le résultat
        System.out.println("La moyenne de la classe est : " + moyenne);
        System.out.println("Il y a " + nombreNotesSuperieures + " notes superieures a la moyenne.");
    }
}

// Explications et Commentaires :
// Ce code commence par importer la classe Scanner pour permettre à l'utilisateur de saisir des entrées dans la console. Ensuite, il demande à l'utilisateur de saisir le nombre de notes qu'il souhaite entrer. Le programme crée un tableau pour stocker ces notes et demande ensuite à l'utilisateur de saisir chaque note une par une.

// Le code calcule ensuite la moyenne des notes en additionnant toutes les notes et en divisant par le nombre de notes. Enfin, il parcourt à nouveau le tableau de notes et compte combien de notes sont supérieures à la moyenne. Le nombre de notes supérieures est ensuite affiché à l'utilisateur.