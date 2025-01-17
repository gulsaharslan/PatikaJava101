import java.util.Scanner;

public class HipotenusHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("üçgen kenarı a: ");
        double a = input.nextDouble();
        System.out.print("üçgen kenarı b: ");
        double b = input.nextDouble();

        double hipotenus= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:" + hipotenus);

        double cevre= a+b+hipotenus;
        double u = cevre/2;
        double alan=  Math.sqrt(u * (u - a) * (u - b) * (u - hipotenus));

        System.out.println("Üçgenin çevresi: " + cevre);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
