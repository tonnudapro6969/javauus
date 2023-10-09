

public class rebane1 {
    public String rebanenimi;
    public String rebanetoit;
    public String rebanetegevus;

    public rebane1(String rebanenimi, String rebanetoit, String rebanetegevus) {
        this.rebanenimi = rebanenimi;
        this.rebanetoit = rebanetoit;
        this.rebanetegevus = rebanetegevus;
    }
    public void karju(){
        System.out.println(" *GRRRRRR* ");
    }
    
        public void rebane1() {
        System.out.println("Minu nimi on " + this.rebanenimi + " minu lemmik toit on " + this.rebanetoit + " ja mina praegu " + this.rebanetegevus + ".");
    }
}
