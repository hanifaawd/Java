import java.util.Scanner;

public class pretest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan bilangan = ");
        int n = sc.nextInt();

        System.out.print("Hasil = " + CalculateFactorial(n));

        sc.close();
    }

    public static int CalculateFactorial(int n) {
        if (n <= 1)
            return 1;
        else if (n == 2)
            return 2;
        else if (n > 2 && n < 1000)
            return (n * CalculateFactorial(n-1) );
        else
            return 0;
    }
}
