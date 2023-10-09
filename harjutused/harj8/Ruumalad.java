public class Ruumalad {

	public static double ristahukas(String a, String h, String l) {
        float alus = Float.parseFloat(a); //alus salvestatakse a-ks
        float korgus = Float.parseFloat(h); //korgus salvestatakse h-ks
        float laius = Float.parseFloat(l);//laius salvestatakse l-ks
        double r = alus * korgus * laius; //arvutatakse kasutaja sisestatud andmed ja salvestatakse muutujasse r
        return r; //muutuja tagastatakse ylesanne8sse
    } 

    public static double kolmnurga(String a, String h) {
        float alus = Float.parseFloat(a); //alus salvestatakse a-ks
        float korgus = Float.parseFloat(h); //korgus salvestatakse h-ks
        double r = alus * korgus; //arvutatakse kasutaja sisestatud andmed ja salvestatakse muutujasse r
        return r; //muutuja tagastatakse ylesanne8sse
    }

    public static double ristkulik(String a, String l, String h) {
        float alus = Float.parseFloat(a); //alus salvestatakse a-ks
        float laius = Float.parseFloat(l); //laius salvestatakse l-ks
        float korgus = Float.parseFloat(h);  //korgus salvestatakse h-ks    
        double r = laius * korgus * alus; //arvutatakse kasutaja sisestatud andmed ja salvestatakse muutujasse r
        return r; //muutuja tagastatakse ylesanne8sse
    }


}