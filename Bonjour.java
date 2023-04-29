import java.util.Scanner;
class Bonjour {
    public static void main (String arg []){
        int nombre, produit;

        System.out.println("Entrez un nombre :");

        
        Scanner sc = new Scanner (System.in);
        //lecture du nombre entré
        nombre = sc.nextInt();

        produit = nombre*nombre;
        System.out.println("Le carré du nombre du " + nombre +" est " + produit );

    }
}