import java.util.Scanner;

public class tp3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le prix HT de l'article : ");
        double prixHT = scanner.nextDouble();

        System.out.print("Entrez le nombre d'articles : ");
        int nombreArticles = scanner.nextInt();

        System.out.print("Entrez le taux de TVA : ");
        double tauxTVA = scanner.nextDouble();

        double prixTTC = (prixHT * (1 + tauxTVA / 100)) * nombreArticles;

        System.out.println("Prix HT : " + prixHT);
        System.out.println("Nombre d'articles : " + nombreArticles);
        System.out.println("Taux de TVA : " + tauxTVA + "%");
        System.out.printf("Prix TTC : %.2f", prixTTC); // Affichage du prix TTC avec 2 décimales

        scanner.close();
    }

}

// Explications :
// Ce code commence par importer la classe Scanner pour pouvoir lire les entrées de l'utilisateur. Il définit ensuite une classe PrixTotalTTC contenant une méthode main.

// Dans la méthode main, un objet Scanner est créé pour lire les entrées de l'utilisateur. Le programme demande ensuite à l'utilisateur d'entrer le prix HT, le nombre d'articles et le taux de TVA à l'aide des méthodes nextDouble() et nextInt() de l'objet Scanner. Les valeurs entrées par l'utilisateur sont stockées dans les variables prixHT, nombreArticles et tauxTVA.

// Le prix total TTC est ensuite calculé à l'aide de la formule (prixHT * (1 + tauxTVA / 100)) * nombreArticles et stocké dans la variable prixTTC.

// Enfin, le programme affiche les résultats à l'aide de la méthode println() de System.out, en incluant des libellés pour chaque valeur affichée. L'objet Scanner est fermé à la fin de la méthode pour libérer les ressources.
// Ici, nous avons remplacé la dernière ligne de la méthode main() avec System.out.printf("Prix TTC : %.2f", prixTTC);. La lettre f après le point signifie que le format s'applique à un nombre à virgule flottante, et le .2 signifie que le nombre doit être affiché avec seulement deux décimales. Le %f spécifie ensuite que la valeur de la variable prixTTC doit être insérée à cet emplacement.