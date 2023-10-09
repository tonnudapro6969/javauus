import java.util.Scanner;

import ylesanne10.Kala1;

public class ylesanne10 {
    public static void main(String[] args) {
        String kalanimi, kalatoit, kalavarv;
        String rebanenimi, rebanetoit, rebanetegevus;
        String rastiknimi,rastiktoit, rastiktegevus;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sisesta loom \n 1 Kala \n 2 Rebane \n 3 Rästik \n Sisesta number palun: ");
        int valik = scanner.nextInt();
        switch (valik) {
            case 1:
                System.out.print("Sisesta kala nimi: ");
                kalanimi = scanner.next();

                System.out.print("Sisesta kala toit: ");
                kalatoit = scanner.next();

                System.out.print("Sisesta kala värvi : ");
                kalavarv = scanner.next();

                Kala1 kala1 = new Kala1(kalanimi, kalatoit, kalavarv);
                kala1.kala1();
                kala1.haal();
                scanner.close();
                break;
            case 2:
                System.out.print("Sisesta rebase nimi: ");
                rebanenimi = scanner.next();

                System.out.print("Sisesta rebase toit: ");
                rebanetoit = scanner.next();

                System.out.print("Sisesta rebase tegevus : ");
                rebanetegevus = scanner.next();

                rebane1 rebane1 = new rebane1(rebanenimi, rebanetoit, rebanetegevus);
                rebane1.rebane1();
                rebane1.karju();
                scanner.close();
            
            break;

            case 3:
                System.out.print("Sisesta rastiku nimi: ");
                rastiknimi = scanner.next();

                System.out.print("Sisesta rastiku toit: ");
                rastiktoit = scanner.next();

                System.out.print("Sisesta rebase tegevus : ");
                rastiktegevus = scanner.next();

                rastik1 rastik1 = new rastik1(rastiknimi, rastiktoit, rastiktegevus);
                rastik1.rastik1();
                rastik1.sss();
                scanner.close();
            break;
            default:
                System.out.println("Proovi uuesti");
                break;
        }
    }
}
