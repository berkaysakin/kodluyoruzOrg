
import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        System.out.print("fizik notunuzu giriniz:");
        int fizik= input.nextInt();

        System.out.print("matematik notunuzu giriniz:");
        int matematik=input.nextInt();

        System.out.print("fizik notunuzu giriniz:");
        int turkce=input.nextInt();

        System.out.print("kimya notunuzu giriniz:");
        int kimya=input.nextInt();

        System.out.print("tarih notunuzu giriniz:");
        int tarih=input.nextInt();

        System.out.print("müzik notunuzu giriniz:");
        int muzik=input.nextInt();

        double ortalama= (fizik+matematik+muzik+tarih+kimya+turkce)/6.0;
        int hudut=60;
        boolean sonuc=ortalama>=hudut;

        String str= sonuc ? "gectiniz": "kaldınız";
        System.out.print(str + " ve not ortalamanız: " + ortalama);
    }
}
