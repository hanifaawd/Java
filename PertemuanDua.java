import java.util.Scanner;

public class PertemuanDua {
    public static void main(String[] args){
        int nip;
        int umur = 20;
        boolean isDibawahUmur;
        nip = 12345;
        double gaji;
        gaji = 1300000.50;
        isDibawahUmur = true;

        System.out.println("Umur : " + umur);
        System.out.println("Gaji : " + gaji);

        String nama, gelar;
        nama = "Mimi Arduino";
        gelar = "M.Kom";

        String namaPotong = nama.substring(0,4);
        System.out.println("Nama Potong : " + namaPotong);
        System.out.println("Nama Lengkap : " + nama + ", " + gelar);

        String nama1 = "Nuraisyah";
        String nama2 = "Nur Aisyah";

        if (nama1.equals(nama2)) {
            System.out.println("nama sama");
        } else {
            System.out.println("nama beda");
        }

        String kata1 = "kaki";
        String kata2 = "kiri";
        String kata3 = "kakek";
        String kata;
        kata = kata1;
        kata = kata + kata2;
        kata = kata + kata3;

        System.out.println("Kata: " + kata);

        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan nama anda : ");
        String nama4 = in.nextLine();
        System.out.println("Nama: " + nama4);

        System.out.println("Masukan nilai : ");
        double nilai = in.nextDouble();
        System.out.println("Nilai : " + nilai);
    }
}
