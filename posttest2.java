import java.util.ArrayList;
import java.util.Scanner;

public class posttest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> angka = new ArrayList<Integer>();

        System.out.print("Masukkan banyak angka : ");
        int banyakAngka = sc.nextInt();

        for(int i = 0; i < banyakAngka; i++){
            System.out.print("Masukkan angka ke-" + (i+1) + " : ");
            angka.add(sc.nextInt());
        }

        int size = angka.size();
        int hasil = 0;

        for(int i = 0; i < size; i++){
            hasil = findGCD(hasil, angka.get(i));
        }
        System.out.println("\n--------------------------\n");
        System.out.println("Faktor Persekutuan Terbesar : " + hasil);

        sc.close();
    }

    public static int findGCD(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        return findGCD(b % a, a);
    }
}
