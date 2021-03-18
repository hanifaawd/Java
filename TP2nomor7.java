import java.util.Scanner;

public class TP2nomor7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Nama : ");
        String nama = in.nextLine();

        for(int i = 0; i<nama.length(); i++){
            if(nama.charAt(i) == 'a'){
                System.out.println("Letak huruf a = " + (i+1));
            }
        }

        in.close();
    }
}
