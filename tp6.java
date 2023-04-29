import java.util.Scanner;

public class tp6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validNumber = false;
        // Boucle tant que le nombre n'est pas compris entre 10 et 20 inclus
        while (!validNumber) {
            System.out.print("Entrez un nombre compris entre 10 et 20 : ");
            number = scanner.nextInt();
            if (number >= 10 && number <= 20) {
                validNumber = true;
            } else if (number < 10) {
                System.out.println("Plus grand !");
            } else {
                System.out.println("Plus petit !");
            }
        }
        System.out.println("Le nombre saisi est : " + number);
    }
}

// Explications et commentaires :
//     La première étape consiste à importer la classe Scanner, qui permet de lire l'entrée de l'utilisateur depuis la console.
//     Nous créons ensuite une instance de Scanner et initialisons deux variables : number pour stocker le nombre saisi par l'utilisateur, et validNumber pour suivre si le nombre est valide ou non.
//     Nous entrons ensuite dans une boucle while qui s'exécute tant que le nombre saisi n'est pas compris entre 10 et 20 inclus.
//     À chaque tour de boucle, nous affichons un message demandant à l'utilisateur de saisir un nombre. Nous utilisons la méthode nextInt() de l'objet Scanner pour lire l'entrée de l'utilisateur et stocker la valeur dans la variable number.
    Nous vérifions ensuite si le nombre est compris entre 10 et 20 inclus en utilisant une instruction if. Si c'est le cas, nous mettons la variable validNumber à true, ce qui sortira de la boucle while.
    Si le nombre n'est pas compris entre 10 et 20 inclus, nous affichons un message approprié selon que le nombre est trop petit ou trop grand. Nous n'affectons pas validNumber car le programme doit continuer à demander un nombre jusqu'à ce que l'utilisateur saisisse un nombre valide.
    Une fois que nous avons sorti de la boucle, nous affichons le nombre saisi par l'utilisateur.