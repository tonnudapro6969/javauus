import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Mootorratas {
    String mootorratas = "Yamaha";
    String Mmudel = "Cruiser";
}

class Soitja {
    String nimi;

    public Soitja(String nimi) {
        this.nimi = nimi;
    }
}

class Treeningrada {
    String rada = "Tallinna hipodroom";
    LocalDateTime kell;

    public Treeningrada(LocalDateTime kell) {
        this.kell = kell;
    }
}

public class ylesanne9 {
    public Mootorratas mootorratas;
    public Soitja soitja;
    public Treeningrada rada;

    public ylesanne9(Mootorratas mootorratas, Soitja soitja, Treeningrada rada) {
        this.mootorratas = mootorratas;
        this.soitja = soitja;
        this.rada = rada;
    }

    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        Mootorratas mootorratas = new Mootorratas();
        Soitja soitja = new Soitja("Albertus");
        Treeningrada rada = new Treeningrada(currentTime);

        System.out.println(" soitja: " + soitja.nimi + " \n Mootoratas: " + mootorratas.mootorratas + "\n Mootratta mudel: " + mootorratas.Mmudel + "\n rada: " + rada.rada + "\n Kelllaaeg ja Kuuupäev: ");
        System.out.println("Kellaaeg ja Kuupäev: " + currentTime.format(formatter));
    }
}

        //System.out.println("soitja: " + soitja.nimi + " \n Mootoratas: " + mootorratas.mootorratas);
        //System.out.println(" \n Mootoratas: " + mootorratas.mootorratas );
        //System.out.println("Mootratta mudel: " + mootorratas.Mmudel);
        //System.out.println("rada: " + rada.rada);
        //System.out.println("Kelllaaeg: " + formattedKell);



        




    //loob uue oibjekti kus on eelnevalt sisestud andmed
        //tulemused.Test(); //kutsub välja Testi meetodi ja kuvab sellesse sisestatud namded

