public class iseseisev11 {
    
    public static int arvutus() { //alamprogramm nimega arvutus
        for (int i = 1; i <= 66; i++) { //pohimotteliselt siin for tsuklis antakse i-le kindel vaartuse tsoon
            if (i % 3 == 0) { //see if statement kontrollib kas i jagub 3 kui on jääk siis ei kuvata seda ekraanile, kui ei ole jääki siis kuvatakse
                System.out.println(i);
            }
        }
        return 0;//annab 0 tagasi
    }

    public static void main(String[] args) { //main funkt
        try { //proovib printida arvutus alamprogrammist (kutsub välja) saadud arvud 
            System.out.println("Arvud: ");
            arvutus();
        } catch (Exception e) { //kui midagi laks valesti voi on kuskil koodis auk, siis catch aktiveerub ning kirjutab et tekkis viga
            System.out.println("Tekkis viga");
        }
    }
}