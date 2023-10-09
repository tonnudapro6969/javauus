import java.util.Scanner;
 
public class ylesanne8 {
 
 public static void main(String[] args) {
 
 Scanner scanner = new Scanner (System.in);
 System.out.print("Rööpküliku ruumala (1) \nRistküliku ruumala (2) \nKolmnurga ruumala  (3) \n" + "Rööpkuliku pindla (4) \n" + "Ristküliku pindala(5) \n" + "Kolmnurga pindla(6)\nVali tegevus: "); //prindib kasutajale valikuvoimalused
 String valik = scanner.next(); //salvestab kasutaja valiku 6
 System.out.print("Sisesta alus: "); //kirjutab tekstsi et kasutaja sisestaks aluse vaartuse
 String alus = scanner.next(); //salvestab vaartuse alusesse
 System.out.print("Sisesta kõrgus: "); //kirjutab teksti ekraanile et kasutaja sisestaks korguse vaartuse
 String korgus = scanner.next(); //salvestab vaartuse korgusesse
scanner.close();
 double r; //vastus
 switch (Integer.parseInt(valik)) { // kui kasutaja sisestas number 2 siis aktiveerib case2: funktsiooni, ehk võrdleb numbreid
 case 1: //kui kasutaja vajutab 1ˇsiis see küsib sellele kuuluva kujundi andmeid
 r = Ruumalad.ristahukas(alus, korgus, korgus); //votab ruumalad failist ristahuyka koodiosa ja kusib asju  ja siis prindib 2 kohta peale koma
 System.out.printf("Rööpküliku ruumala on %.2f ",r);
 break;  //lopetab funktisooni
 case 2: //kui kasutaja vajutab 2 siis see küsib sellele kuuluva kujundi andmeid
 r = Ruumalad.ristkulik(alus, korgus, korgus); //votab ruumalad failist ristkuliku koodiosa ja kusib alus ja korgus ja siis prindib 2 kohta peale koma
 System.out.printf("Ristküliku ruumala on %.2f ",r);
 break; //lopetab funktisooni
 case 3: //kui kasutaja vajutab 3siis see küsib sellele kuuluva kujundi andmeid
 r = Ruumalad.kolmnurga(alus, korgus); //votab ruumalad failist kolmnurga koodi ja kusib alus ja korgus jne ja siis prindib 2 kohta peale koma
 System.out.printf("Kolmnurga ruumala on %.2f ",r);
 break; //lopetab funktisooni
 
 case 4:
 r = Pindalad.roopkylikS(alus, korgus);
 System.out.printf("Rööpküliku pindala on %.2f ",r); //see prindib välja rööpküliku valemi
 break;
case 5:
 r = Pindalad.ristkylikS(alus, korgus);
 System.out.printf("Ristküliku pindala on %.2f ",r); //see prindib valja ristküliku valemi
 break;
case 6:
 r = Pindalad.kolmnurkS(alus, korgus);
 System.out.printf("Kolmnurga pindala on %.2f ",r); //see prindib välja kolmnurga valemi
 break;
 
 
 
 default:  // kui midagi ei valita siis see kood kaivitub ja prindib
 System.out.print("Valik  ebaõnnestus!");
 break; //lopetab fuinktsiooni
 }
 
 }

}
 