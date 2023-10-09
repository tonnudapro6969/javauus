import java.util.Scanner;

public class iseseisev20 {
    public static int arvutus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sisesta bin arv: ");
        String binarv = scanner.nextLine();
        int decarv = 0; // decarv muutuja on 0
        scanner.close();
        try {
            decarv = Integer.parseInt(binarv, 2); // proovib teisendada antud arvu bin dec arvuks.
        } catch (NumberFormatException e) { //catch kask kaivitub kui ei ole korrektne
            System.out.println("Sisestage oige bin arv."); 
        }
            return 0; //tagastab 0 kui ei ole oige arv
        }
    

    public static void main(String[] args) {
        int decarv = arvutus(); // Kutsub arvutused meetodi välja ja saab tagastatud väärtuse.

        System.out.println("dec arv on: " + decarv);
    }
}

