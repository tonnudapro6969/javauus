public class kiisu {
    // var
    public String nimi; //algsed andmed mis defineeritakse aära
    public String iseloom;
    public int vanus; //int sest on numbreid sisaldavb arv
    public String varv;
    public String tegevus;

    // konstruktor
    public kiisu(String nimi, String iseloom, int vanus, String varv, String tegevus) { //uus konstrukor
        this.nimi = nimi; //defineeritakse nimi = nimi (salvestab sisestatud andmed)
        this.iseloom = iseloom;
        this.vanus = vanus;
        this.varv = varv;
        this.tegevus = tegevus;
    }

    // meetod
    public void Tutvustus() { //funktsioon nnimega tutvustus ja selle print kasu sisse pannakse koik sisestatud andmed ja kutsutakse valja kiisu82 funktsioonis
        System.out.println("tere minu nimi on " + this.nimi + " olen " + this.iseloom + " iseloomuga, ma olen " + this.vanus + " aastat vana. \nMinu karv on " + this.varv + " ja  mina hetkel " + this.tegevus + ".");
    }
}