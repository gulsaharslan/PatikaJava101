import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut=2.14, elma=3.67,  domates=1.11,  muz=0.95, patlican=5;
       System.out.print("Kaç kilo armut? : ");
       double armutKilo=input.nextDouble();
        System.out.print("Kaç kilo elma? : ");
        double elmaKilo=input.nextDouble();
        System.out.print("Kaç kilo domates? : ");
        double domatesKilo=input.nextDouble();
        System.out.print("Kaç kilo muz? : ");
        double muzKilo=input.nextDouble();
        System.out.print("Kaç kilo patlıcan? : ");
        double patlicanKilo=input.nextDouble();

        double toplamTutar=(armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam Tutar : "+toplamTutar);
    }
}
