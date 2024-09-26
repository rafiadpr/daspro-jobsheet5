import java.util.Scanner;

public class Siakad23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nilaiAkhir;

        System.out.println("========================================");
        System.out.println("Aplikasi SIAKAD");
        System.out.println("Selamat Datang");
        System.out.println("========================================");

        System.out.println("");

        System.out.print("Masukkan nama\t : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan NIM\t : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan kelas\t : ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan nomor absen\t : ");
        byte absen = sc.nextByte();

        System.out.print("Masukkan nilai tugas\t : ");
        double nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan nilai kuis\t : ");
        double nilaiKuis = sc.nextDouble();

        System.out.print("Masukkan nilai UTS\t : ");
        double nilaiUTS = sc.nextDouble();
        
        System.out.print("Masukkan nilai UAS\t : ");
        double nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        String nilaiHuruf = "";
        double nilaiSetara = 0;
        String kualifikasi = "";

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A"; 
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+"; 
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B"; 
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+"; 
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C"; 
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D"; 
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E"; 
            nilaiSetara = 0;
            kualifikasi = "Gagal";
        }

        System.out.println("");
        System.out.println("Nama : " + nama + " dengan NIM : " + nim);
        System.out.println("Kelas : " + kelas + " dengan absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf : " + nilaiHuruf);
        System.out.println("Kualifikasi : " + kualifikasi);
    }
}
