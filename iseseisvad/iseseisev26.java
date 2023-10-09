//tonis kandmaa it22 ulesanne 26 vaiba asja tegemine
import java.util.Scanner;

class vaibahinnaarvutus {
    private double pikkus;
    private double laius;
    private double vaibahind; //phm need on privaat klassi muutujad mis hoiavad neid kindlaid andmeid

    public vaibahinnaarvutus(double pikkus, double laius, double vaibahind) {
        this.pikkus = pikkus;
        this.laius = laius;
        this.vaibahind = vaibahind; //salvestatakse antud andmed nende nimedega et all pool kasutada neid arvutada vaibahinda
    }

    public double arvutaruumisuurus() {
        return pikkus * laius;  //arvutab ruumisuuruse ja salvestab 
    }

    public double arvutavaibahind() {
        double ruumisuurus = arvutaruumisuurus(); //salvestab arvutaruumisuurus ruumisuurusesse, arvutab vaibahinna valja
        return ruumisuurus * vaibahind; //salvestab andmed ja kasutab neid siis kui ned valja kutsutakse 
    }

    public void ruumisuuruss() {
        System.out.println("ruumi suurus on: " + arvutaruumisuurus() + " ruutmerttrit"); //kuvab ruumi lopliku suuruse ruumetteristses
    }

    public void vaibahindd() {
        System.out.println("vaiba hind on: " + arvutavaibahind() + " eurot");  //kuvab vaibahinna
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //uus input

        System.out.print("porandapikkus: ");//kusib kasutajalt ja lisab laisue jargmisesse kohta nimega pkkus
        float pikkus = sc.nextFloat();
        System.out.print("poranda laius: "); //kusi kasutajalt ja lisab laisue jargmisesse noh kohta nimega laius
        float laius = sc.nextFloat(); 
        double vaibahind = 0.50; // 1ruutmeerti kohta 50senti

        vaibahinnaarvutus vaibahinnaarvutus = new vaibahinnaarvutus(pikkus, laius, vaibahind); // vaibahinnarvutuse konstrukotir loomine?


        vaibahinnaarvutus.ruumisuuruss();   // ruumisuuruse ja vaiba hinna alamprogrammide valja kutsumine 
        vaibahinnaarvutus.vaibahindd();
        sc.close(); //sulgeb scanneri
    }
}