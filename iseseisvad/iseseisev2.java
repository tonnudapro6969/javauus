//iseseisev 2 geneereeritais arv 1-6
// ma ei saa pointist aru miks lisada try catch kasud kuna siin on voimatu et vigu tekib sest ainuksesed arvud on 0-6ni

import java.util.Random;

public class iseseisev2 {
    public static int arvutus() {
        Random arv = new Random(); //uus randomi kask, saab kusida suvalist arvu
        int vastus = arv.nextInt(6) + 0; //valib suvalise arvu tanu random kasule 0-6ni
        return vastus; //tagastab vastuse et seda main funktsioonis kasutada
    }

    public static void main(String[] args) {
        int vastus = arvutus(); //tombab vastuse main funktsiooni arvutus alamprogrammist 
        System.out.println(vastus); //kuvab vastuse
    }
}
