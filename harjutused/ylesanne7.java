
import java.util.InputMismatchException;
import java.util.Scanner;

public class ylesanne7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tekst = true;  //boolean = tekts ehk kui seal all on tekst = false siis prindib tektsi
            try {
                System.out.print("Esiemen arv: "); //kusib esimest arvu
                int arv1 = scanner.nextInt();   //salvestab antud arvu arv1 

                System.out.print("teine arv: ");  //kusib teise arvu
                int arv2 = scanner.nextInt(); //salvestab antud arvu arv2

                int summa = arv1 + arv2; //arvutab ja prindib tulemuse
                System.out.println("vastus: " + summa);  //prindib

                tekst = false;    //ülemine programm sulgeb ehk vastust ei prindita välja
            } catch (InputMismatchException e) {    //näiutab et kasutaja sisestas tähe mitte arvu
                System.out.println("ära sisesta teksti, aInult arvud!"); //  prindib välja errori et sisestasid teksti mi9tte arvud
            }
        scanner.close();
    }
}


