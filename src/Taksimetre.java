import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double acilis= 10;
        double km=2.20;
        double min=20;

        System.out.print("Mesafeyi Giriniz(km) : ");
        double mesafe=input.nextDouble();

        double toplamTutar=acilis + (km*mesafe);

        if(toplamTutar<min){
            toplamTutar=min;
        }

        System.out.println("Toplam Tutar : "+toplamTutar + "TL");
    }
}
