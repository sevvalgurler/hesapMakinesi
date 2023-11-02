import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[]args){
        double armut=2.14, elma=3.67, domates=1.1, muz=0.95, patlican=5.0, a, e, d, m, p, tutar ;
        Scanner inp = new Scanner(System.in);
        System.out.print("armutun kilosunu giriniz:");
        a = inp.nextDouble();
        System.out.print("elmanın kilosunu giriniz:");
        e = inp.nextDouble();
        System.out.print("domatesin kilosunu giriniz:");
        d = inp.nextDouble();
        System.out.print("muzun kilosunu giriniz: ");
        m = inp.nextDouble();
        System.out.print("patlıcanın kilosunu giriniz:");
        p = inp.nextDouble();

        tutar=(armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);
        System.out.print("tutar:"+tutar);
    }

}

