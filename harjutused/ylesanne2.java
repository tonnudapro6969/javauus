public class ylesanne2 {
 
    public static void main(String[] args) {
    float toll = 10.0f;                                 
    float meeter = toll * 0.0254f; // tolli valem
    System.out.println(meeter + " meeter");  
    System.out.println(ellipsS(9f, 4f));
    double s1 = sportlasekiirus(50, 876431);// see votab esimese sportlase kiiruse
    double s2 = sportlasekiirus(2000, 90);   // see votab teise sportlase kiiruse
    double vahe = s1 - s2;
    System.out.println("kahe sportlase kiiruse vahe oli " + Math.abs(vahe) +  " m.");
}
    static double sportlasekiirus(int dis, int aeg){
        double kiirus = dis / aeg;   //see votab sportlase kiiruse ja jagab selle distantsiga
        return kiirus;
    }
    static double ellipsS(float a,float b){
    double PI = 3.14f;
    double S = PI * a * b; //see on PI valem
    double vastus = Math.round(S*100.0)/100.0;// korrutab 100 pindalaga ja lopuks jagab selle 100ga
    return vastus; //tagastab
}
    static void tunnid(float minutid){
    int tund = 25;
    float minut =  minutid / tund;   //teeb tunnid minutiks
    System.out.println("tunnid =" + minut);
}
}