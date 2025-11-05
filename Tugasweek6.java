import java.util.Scanner;

public class Tugasweek6{
    public static void main(String[] args) {
       
      Scanner ns = new Scanner(System.in);

        double strukturData, pbo, basisData, algoritma, rpl;
        double rataRata, ipk;
        String predikat;

        System.out.println("SELEKSI ASISTEN DOSEN");
        System.out.print("Masukkan nilai Struktur Data: ");
        strukturData = ns.nextDouble();
        System.out.print("Masukkan nilai Pemrograman Berorientasi Objek: ");
        pbo = ns.nextDouble();
        System.out.print("Masukkan nilai Basis Data: ");
        basisData = ns.nextDouble();
        System.out.print("Masukkan nilai Algoritma dan Pemrograman: ");
        algoritma = ns.nextDouble();
        System.out.print("Masukkan nilai Rekayasa Perangkat Lunak: ");
        rpl = ns.nextDouble();
        
        rataRata = (strukturData + pbo + basisData + algoritma + rpl) / 5;
        ipk = (rataRata / 100) * 4;

        if (ipk >= 3.75) {
            predikat = "A (Sangat Baik)";
        } else if (ipk >= 3.50) {
            predikat = "AB (Baik Sekali)";
        } else if (ipk >= 3.00) {
            predikat = "B (Baik)";
        } else if (ipk >= 2.50) {
            predikat = "BC (Cukup)";
        } else {
            predikat = "C (Kurang)";
        }
        System.out.println("\nRata-rata nilai: " + String.format("%.2f", rataRata));
        System.out.println("IPK Sederhana  : " + String.format("%.2f", ipk));
        System.out.println("Predikat       : " + predikat);

        if (ipk < 3.50) {
        System.out.println("Anda belum memenuhi syarat untuk mendaftar Asisten Dosen.");
        System.out.println("Minimal predikat A atau AB.");
        System.exit(0); // Program selesai
        }





        



       




    }
}