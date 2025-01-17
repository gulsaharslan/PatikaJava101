import java.util.Scanner;

public class DaireAlanveCevre {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        int r = input.nextInt();
        double pi=3.14;

        double alan=r*r*pi;
        double cevre=2*pi*r;

        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Merkez açı ölçüsünü giriniz: ");
        double aci=input.nextDouble();

        double dilimAlan=(pi*(r*r)*aci)/360;
        System.out.print("Dairenin dilim alanı: "+dilimAlan);


    }
}
