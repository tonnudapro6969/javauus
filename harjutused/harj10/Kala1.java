package ylesanne10;

public class Kala1 {
    public String kalanimi;
    public String kalatoit;
    public String kalavarv;

    public Kala1(String kalanimi, String kalatoit, String kalavarv2) {
        this.kalanimi = kalanimi;
        this.kalatoit = kalatoit;
        this.kalavarv = kalavarv2;
    }    
	public void haal(){
        System.out.println(" *mull mull* ");
    }

    public void kala1() {
        System.out.println("Tere, mina olen " + this.kalanimi + " minu toit on " + this.kalatoit + " ja minu värv on " + this.kalavarv + ".");
    }
}
