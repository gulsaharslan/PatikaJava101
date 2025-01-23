
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        double sayi1=input.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2=input.nextDouble();

        System.out.println("Lütfen işlemi seçiniz;");

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.println("İşlem:");
        int secim=input.nextInt();
        double sonuc=0;

        switch(secim){
            case 1:
                sonuc=sayi1+sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;
            case 2:
                    sonuc=sayi1-sayi2;
                    System.out.println("Sonuç:"+sonuc);
                    break;

            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;

            case 4:
                if(sayi2==0)
                {
                    System.out.println("Tanımsız");
                    break;
                }
                else
                    sonuc=sayi1/sayi2;
                System.out.println("Sonuç:"+sonuc);
                break;

            default:
                System.out.println("Hatalı değer girdiniz!!");
                break;
        }

    }
}

