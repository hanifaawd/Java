import java.util.Scanner;

public class TP2nomor8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = 0;
        String lagi;
        do {
            System.out.println("Nilai = ");
            int angka = in.nextInt();
            total = total + angka;

            System.out.println("Menghitung lagi (y/t)?");
            lagi = in.next();
        } while (lagi.equals("y") || lagi.equals("Y"));
        System.out.println("Total = " + total); 

        in.close();
    }
}
