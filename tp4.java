import java.util.Scanner;

public class tp4 {
    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le premier nombre
        System.out.print("Entrez le premier nombre : ");
        int num1 = scanner.nextInt();

        // Demander à l'utilisateur d'entrer le deuxième nombre
        System.out.print("Entrez le deuxieme nombre : ");
        int num2 = scanner.nextInt();

        // Vérifier si le produit est négatif ou positif en fonction des nombres entrés
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            System.out.println("Le produit des deux nombres est negatif.");
        } else {
            System.out.println("Le produit des deux nombres est positif.");
        }
    }
}

// Explication :
// Le programme demande à l'utilisateur d'entrer deux nombres à l'aide de l'objet Scanner, puis vérifie si leur produit est négatif ou positif sans effectuer le calcul de produit. Pour cela, il utilise une condition qui vérifie si l'un des nombres est positif et l'autre négatif. Si c'est le cas, le produit sera négatif, sinon il sera positif.