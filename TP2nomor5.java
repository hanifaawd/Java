import java.util.Scanner;

public class TP2nomor5 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Panjang : ");
        int panjang = in.nextInt();
        System.out.println("Lebar : ");
        int lebar = in.nextInt();

        int keliling = (2 * panjang) + (2 * lebar);
        int luas = panjang * lebar;
        
        System.out.println("Keliling Persegi : " + keliling + " cm");
        System.out.println("Luas Persegi : " + luas + " cm");

        in.close();
    }
}
