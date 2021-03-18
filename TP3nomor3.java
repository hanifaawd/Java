import java.util.Scanner;

public class TP3nomor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = 2;
        
        System.out.print("Masukkan banyak bilangan pertama : ");
        int num2 = sc.nextInt();

        System.out.print("Bilangan genap pertama : ");
        bilanganGenap(num1, num2);

        sc.close();
    }

    public static int bilanganGenap(int num1, int num2) {
        if(num1 > num2)
            return 0;
        System.out.print(num1 + " ");
        return bilanganGenap((num1 + 2), num2);
    }

}
