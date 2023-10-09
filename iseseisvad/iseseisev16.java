public class iseseisev16 {
    
    public static int arvutussumma(int[] arvud) {
        int summa = 0; //algne vaartus on 0
        for (int i = 0; i < arvud.length; i++) { //for tsukkel kus defineeritakse i ja kui i on suurem kui arvude pikkus siis tsukkel lopetab tootamise
            summa += arvud[i]; //liidab arvud ehk I summale mille algne vaartus on 0 ja tagastab selle all pool
        }
        return summa;
    }
    
    public static double arvutuskeskmine(int[] arvud) { //uus alamprogramm nimega keskmine mis votab massiivi arvud alt
        int summa = arvutussumma(arvud);  //kutsub vlaja summa programmi et võtta sealt arvud 
        if (arvud.length > 0) { //kontrollib et arvude pikkus oleks suurem kui 0 
            double keskmine = (double) summa / arvud.length; //arvcutab keskmise ehk jagab summa arvudega
        
            return keskmine;
        }
        
        return summa; //tagastab summa ja keskmine (yleval)
    }

    public static void main(String[] args) { //main funktsioon
        try { 
            // arvud on listis
            int[] arvud = { 6, 1, 5, 12, 44 };
            
            // kutsuvad alamprogrammi arvude summa ja keskmise valja
            int summa = arvutussumma(arvud);
            double keskmine = arvutuskeskmine(arvud);
            
            // prindib summa ja keskmise
            System.out.println("Arvude summa: " + summa);
            System.out.println("antud arvude keskmine: " + keskmine);
        } catch (Exception e) { //catch aktiveerub kui tekkis erand probleem või arvudes on valed andmed
            System.out.println("Tekkisv viga, kontrollige ule"); 
        }
    }
}
