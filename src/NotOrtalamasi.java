import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan veri alma
        Scanner input = new Scanner(System.in);

        // Ders notlarını kullanıcıdan alalım
        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = input.nextInt();

        // Not ortalamasını hesaplama
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        // Ternary operator kullanarak geçme durumunu belirleme
        String sonuc = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        // Sonuçları ekrana yazdırma
        System.out.println("Not Ortalamanız: " + ortalama);
        System.out.println("Durum: " + sonuc);
    }
}
