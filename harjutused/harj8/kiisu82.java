import java.util.Scanner;

public class kiisu82 {
    public static void main(String[] args) {
        String nimi, iseloom, varv, tegevus; //string ehk see defineerib mis on tekst ja all vanus ehk sisaldab numbrit
        int vanus;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tere, sisesta teie kassi andmed!\n"); 

        System.out.print("Sisesta kiisu nimi: "); //sisesta kiisu nimi ja sisestatud nimi salvestatakse 
        nimi = scanner.next();

        System.out.print("Sisesta kiisu iseloom: ");
        iseloom = scanner.next();

        System.out.print("Sisesta kiisu vanus: ");
        vanus = scanner.nextInt();

        System.out.print("Sisesta kiisu karvavärv: ");
        varv = scanner.next();

        System.out.print("Sisesta kiisu tegevus: ");
        tegevus = scanner.next();

        kiisu kiisu = new kiisu(nimi, iseloom, vanus, varv, tegevus); //see rida loob uue objekti kus sees on sisestatud andmed
        kiisu.Tutvustus(); //kutsub valja kiisu funktsiooni
        scanner.close();
    }
}