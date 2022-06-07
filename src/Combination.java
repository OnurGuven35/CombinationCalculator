import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, r;
        int total1 = 1, total2 = 1, total3 = 1;
        int sonuc;

        System.out.print("C(n,r) Durumunda n Degerini Giriniz : ");
        n = inp.nextInt();
        System.out.print("C(n,r) Durumunda r Degerini Giriniz : ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            total1 *= i;
        }

        for (int j = 1; j <= r; j++) {
            total2 *= j;
        }

        for (int k = 1; k <= (n - r); k++) {
            total3 *= k;
        }

        if ((n < r) || (n <= 0) || (r < 0)) {
            System.out.print("Hatali Deger Girdiniz, Lutfen Tekrar Deneyiniz ! ");
        } else if (r == 0) {
            sonuc = 1;
            System.out.print("C(" + n + "," + r + ") Isleminin Sonucu : " + sonuc);
        } else {
            sonuc = total1 / (total2 * total3);
            System.out.print("C(" + n + "," + r + ") Isleminin Sonucu : " + sonuc);
        }
    }
}
