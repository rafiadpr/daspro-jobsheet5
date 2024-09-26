
import java.util.Scanner;

public class PemilihanHariDenganIf23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int angka = sc.nextInt();

        String hasil;

        if (angka >= 1 && angka <= 5) {
            hasil = "Weekday";
        } else if (angka == 6 || angka == 7) {
            hasil = "Weekend";
        } else {
            hasil = "Invalid Number";
        }

        System.out.println("Hari tersebut adalah: " + hasil);
    }
}
