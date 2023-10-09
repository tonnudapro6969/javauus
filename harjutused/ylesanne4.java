import java.util.Scanner;

public class ylesanne4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta suvaline tekst: ");
        String tekst = scanner.nextLine();

        String suuredtahed = tekst.toUpperCase();
        System.out.println("Suur tähtr: " + suuredtahed);

        int markidearv = tekst.length();
        System.out.println("Märkide arv: " + markidearv);
        String[] sonad = tekst.split("\\s+");
        int sonadearv = sonad.length;
        System.out.println("Sõnade arv: " + sonadearv);
        String esimenesona = sonad[0];
        System.out.printf("Esimene sõna: %s%n", esimenesona);

        scanner.close();
    }
}
