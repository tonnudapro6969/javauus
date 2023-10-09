import java.util.Scanner;

public class iseseisev20 {
    public static int arvutused() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta binaararv: ");
        String binarv = scanner.nextLine();

        int decarv = Integer.parseInt(binarv, 2); //teisendab binaararvu deciaml arvuks ja salvestab muutujasse decarv
        scanner.close();

        return decarv; //tagastab
    }

    public static void main(String[] args) {
        int decarv = arvutused(); //kutsub arvutused meetodi valja ja prindib

        System.out.println("Decimal süsteemi arv on: " + decarv);
    }
}
