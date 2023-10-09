import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ylesanne6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uus scanneri kask 
        int summa = 0; //muutujate summad algseisus
        int arvudeArv = 0;

        System.out.println("sisesta taisarv ja jata tühjaks kui soovid lõpteda:"); //kuvab kasutaja erkaanile kirja

        while (true) { //while tsukkel mis jaab igaveseni loopima kuni break kask aktiveeritakse
            String arvud = sc.nextLine(); //salvestab kasutaja siestatud arvud ja kusib uuesti

            if (arvud.isEmpty()) { //kui arvude inputi kask on tuhi siis aktiveerib break kasu
                break; // lopedtab while tsukli
            }

            try { //proovib teisendada sisestuse taisarvuks
                int arv = Integer.parseInt(arvud);
                summa += arv;//summa liidab ja siis vordub= arv
                arvudeArv++; //suurendab sisestatud arvud?
            } catch (NumberFormatException e) { //kui sisestus ei ole numbri formaadis siis kuvab kasutajale kirja et sisestaks taisarvu
                System.out.println("sisestage palun ainult täisarv.");
            }
        }

        if (arvudeArv >= 0) { //kontrollib kas sisestati taisarv mis on suurem voi vordne 0ga
            double keskmine = (double) summa / arvudeArv; //arvutab keskmist summa jagatud arvudearv
            System.out.println("summa: " + summa); //kuvab  summa ja keskmise ekraanile
            System.out.println("keskmine: " + keskmine);

            FAILSALVESTUS(summa, keskmine); //salvestab andmed failisalvestuse alamprogrammi ja kui ei sisestatud arve kirjutab seda
        } else {
            System.out.println("ei sisestatud arve.");
        }

        sc.close(); //scanner kinni
    }

    public static void FAILSALVESTUS(int summa, double keskmine) { //alustatakse failisalvestust nende muutujatega
        try (PrintWriter writer = new PrintWriter(new FileWriter("ylesanne6.txt"))) { //proovib failisalvestust alustada
            
            writer.println("summa: " + summa); // Kirjutab arvude summa ja keskmise  tekstifaili.
            writer.println("Keskmine: " + keskmine);
        } catch (IOException e) { //kui tekib viga siis tuleb appi kask nimega catch ja kuvab ekraanile kirja
            System.out.println("faili tegeimisel tekkis viga: " + e.getMessage());
        }
    }
}








