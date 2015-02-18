import java.util.Scanner;

/**
 * Created by amineboufatah on 18/02/15.
 */
public class Main {

    public static void main (String [] args ) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.err.println("WELCOME BLEDARD !!! NOBODY DOES IT BETTER");
        String choix = scanner.next();

        try {
            while (!(choix.equals("quitter"))) {

                if (choix.equals("+") || choix.equals("-") || choix.equals("*")) {
                    calculator.saisieSymbole(choix.charAt(0));

                } else if (choix.equals("=")) {
                    calculator.saisieSymbole('=');
                    System.out.println(calculator.valider());

                } else if (choix.equals("C")) {
                    calculator.reset();

                } else {
                    calculator.saisieChiffre(choix);
                }

                choix = scanner.next();
            }
            System.out.println("Thanks for coming ;) ");

        } catch (Exception e) {
            System.err.println("Une erreur s'est produite !! ");
        }
    }
}
