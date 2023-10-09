import java.util.Scanner;
//tonis kadnmaa it-22
public class ylesanne5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("sisesta jagatav: "); //kusib kasutajalt esimese arvu
            double arv1 = scanner.nextDouble(); //salvestab arvu arv1te, double tahendab et voib olla ka komaga arv

            System.out.println("sisesta jagaja: "); //ksubi kasutajalt 2. arvu
            double arv2 = scanner.nextDouble(); //salvestab arvu arv2te

            if (arv1 >= 0 && arv2 > 0) { //esimene arv voib olla vordne ja suurem kui null aga arv 2 peab olema suurem ja kui ei ole siis tuleb alla proovi uuesti kiri
                double tulemus = jagamine(arv1, arv2);
                System.out.println("vastus: " + tulemus);
            } else { //kui mingi arv on negatiivne voi/ja jagaja on 0  siis prindib kirja ja vastust ei väljastata
                System.out.println("proovi uuesti arv ei tohi olla negatiivne j jagaja ei tohi olla 0.");
           
            }
         
        }
        scanner.close();
    }

    private static double jagamine(double arv1, double arv2) {  //doulbe lubab komakohtadega arve  ja arvutab arv1 ja arv2 ja tagastab nad 
        return arv1 / arv2;
    }
    
}


    