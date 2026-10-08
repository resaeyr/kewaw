package collab;

import java.util.Scanner;

public class studikasus2 {
    public static void main(String[] args) {
        Scanner kewa = new Scanner (System.in);

        String nama;
        String jenisKegiatan;
        int jmlDokumen;
        int peringkat;
        int statusPkm;

        System.out.print("Nama mahasiswa: ");
        nama = kewa.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = kewa.nextLine();
        System.out.print("Jumlah dokumen yang dikumpulkan: ");
        jmlDokumen = kewa.nextInt();
        System.out.print("Peringkat: ");
        peringkat = kewa.nextInt();
        System.out.print("Status PKM (1 untuk lolos, 0 untuk tidak lolos): ");
        statusPkm = kewa.nextInt();

        // if jenis kegiatan 
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI") || jenisKegiatan.equalsIgnoreCase("PKM") || jenisKegiatan.equalsIgnoreCase("LAINNYA")) {

            // if buat jumlah dokumen khusus lomba 
            if (jmlDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jmlDokumen) + " dokumen).");
                System.out.println("Dana penghargaan tidak diberikan.");
            } else {

                //if buat peringkat juara
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Dokumen lengkap.");
                    System.out.println("Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan Juara 1, 2, atau 3.");
                    System.out.println("Dana penghargaan tidak diberikan.");
                }
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            // if buat status PKM
            if (statusPkm == 1) {
                System.out.println("Status : Dokumen lengkap.");
                System.out.println("Dana penghargaan diberikan.");
            } else {
                System.out.println("Status : Dokumen lengkap, tetapi tidak lolos PKM.");
                System.out.println("Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Jenis kegiatan tidak valid.");
            System.out.println("Dana penghargaan tidak diberikan.");
        }
    }
}
