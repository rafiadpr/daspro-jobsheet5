
import java.util.Scanner;

public class Kafe23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean anggota;

        System.out.println("========================================");
        System.out.println("Aplikasi Kasir Kafe");
        System.out.println("Selamat Datang");
        System.out.println("========================================");

        System.out.println("");
        System.out.println("Menu yang tersedia : ");
        System.out.println("Kopi = 12000");
        System.out.println("Teh = 7000");
        System.out.println("Coklat = 20000");
        System.out.println("");

        System.out.print("Masukkan Menu : ");
        menu = sc.nextLine();
        System.out.print("Masukkan Ukuran Cup (S / M / L) : ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan Jumlah : ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan Keanggotaan (true / false) : ");
        anggota = sc.nextBoolean();

        double harga = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                harga = 12000;
                break;
            case "teh":
                harga = 7000;
                break;
            case "coklat":
                harga = 20000;
                break;
        }

        double total = harga * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                total += 0.25 * total;
                break;
            case 'L':
                total += 0.4 * total;
                break;
        }

        double diskon = anggota ? 0.1 : 0;
        double bayar = total - (diskon * total);

        System.out.println("");
        System.out.println("========================================");
        System.out.println("Item Pembelian : " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal Bayar : Rp. " + bayar);
    }
}
