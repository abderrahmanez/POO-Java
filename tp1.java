import java.util.Scanner;

public class tp1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Entrez la valeur de a : ");
      int a = sc.nextInt();

      System.out.print("Entrez la valeur de b : ");
      int b = sc.nextInt();

      System.out.println("Avant l'echange : a = " + a + ", b = " + b);

      int temp = a;
      a = b;
      b = temp;

      System.out.println("Après l'echange : a = " + a + ", b = " + b);

      sc.close();
   }
}

// Explication du code :

//     Nous avons importé la classe Scanner depuis le package java.util pour permettre à l'utilisateur de saisir des valeurs.
//     Nous avons créé un objet Scanner appelé "sc" qui prendra en entrée le flux standard System.in.
//     Nous avons utilisé la méthode "nextInt" de l'objet Scanner pour permettre à l'utilisateur d'entrer les valeurs des variables "a" et "b".
//     Nous avons affiché les valeurs initiales des variables à l'aide de la méthode "println" de la classe "System".
//     Nous avons échangé les valeurs des variables en utilisant une variable temporaire "temp".
//     Nous avons de nouveau affiché les valeurs des variables échangées à l'aide de la méthode "println" de la classe "System".
//     Enfin, nous avons fermé l'objet Scanner à l'aide de la méthode "close".