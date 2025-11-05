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

        ipkSederhana = (rataRata / 100) * 4;

        



       




    }
}