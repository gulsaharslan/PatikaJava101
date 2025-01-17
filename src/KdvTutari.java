import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen ürün fiyatı giriniz: ");
        double fiyat = input.nextDouble();

        double kdvOrani=(fiyat>0 && fiyat <=1000) ? 0.18 : 0.08;
        double kdvTutari= fiyat*kdvOrani;
        double kdvliFiyat=fiyat+kdvTutari;

        System.out.println("KDV'siz Fiyat: " + fiyat + " TL");
        System.out.println("KDV Oranı: " + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
    }
}
