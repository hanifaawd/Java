import java.util.Scanner;

public class TP3nomor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan banyak bilangan : ");
        int angka = sc.nextInt();

        for(int i = 0; i < angka; i++){
            System.out.print(calculateFibonacci(i) + " ");
        }

        sc.close();
    }

    public static int calculateFibonacci(int angka) {
        if(angka <= 1)
            return angka;
        return calculateFibonacci(angka - 1) + calculateFibonacci(angka - 2);
    }
}
