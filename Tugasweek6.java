import java.util.Scanner;

public class Tugasweek6{
    public static void main(String[] args) {
       
      Scanner input = new Scanner(System.in);

        double strukturData, pbo, basisData, algoritma, rpl;
        double rataRata, ipk;
        String predikat;

        System.out.println("SELEKSI ASISTEN DOSEN");
        System.out.print("Masukkan nilai Struktur Data: ");
        strukturData = input.nextDouble();
        System.out.print("Masukkan nilai Pemrograman Berorientasi Objek: ");
        pbo = input.nextDouble();
        System.out.print("Masukkan nilai Basis Data: ");
        basisData = input.nextDouble();
        System.out.print("Masukkan nilai Algoritma dan Pemrograman: ");
        algoritma = input.nextDouble();
        System.out.print("Masukkan nilai Rekayasa Perangkat Lunak: ");
        rpl = input.nextDouble();
        
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
        System.out.println("\nPilih mata kuliah yang ingin diajukan sebagai Asisten Dosen:");
        System.out.println("1. Struktur Data");
        System.out.println("2. Pemrograman Berorientasi Objek");
        System.out.println("3. Basis Data");
        System.out.println("4. Algoritma dan Pemrograman");
        System.out.println("5. Rekayasa Perangkat Lunak");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = input.nextInt();
        double nilaiPilihan = 0;
        String namaMatkul = "";

        switch (pilihan) {
            case 1:
                nilaiPilihan = strukturData;
                namaMatkul = "Struktur Data";
                break;
            case 2:
                nilaiPilihan = pbo;
                namaMatkul = "Pemrograman Berorientasi Objek";
                break;
            case 3:
                nilaiPilihan = basisData;
                namaMatkul = "Basis Data";
                break;
            case 4:
                nilaiPilihan = algoritma;
                namaMatkul = "Algoritma dan Pemrograman";
                break;
            case 5:
                nilaiPilihan = rpl;
                namaMatkul = "Rekayasa Perangkat Lunak";
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }
        if (nilaiPilihan >= 75) {
            System.out.println("\nSelamat! Anda dinyatakan LULUS seleksi Asisten Dosen untuk mata kuliah " + namaMatkul + ".");
          } else {
            System.out.println("\nMaaf, nilai Anda pada mata kuliah " + namaMatkul +
                    " belum memenuhi syarat minimal (75).");
        }
        input.close();
      }
}