import java.util.Scanner;

public class KitleIndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz(m) : ");
        double boy=input.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        double kilo=input.nextDouble();

        double indeks=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz:"+indeks);


    }
}
