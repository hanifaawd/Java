import java.util.Scanner;

public class TP2nomor6 {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        System.out.println("Penghasilan Per Bulan : ");
        double Penghasilan = in.nextDouble();
        if(Penghasilan < 1000000){
            System.out.println("Tidak kena pajak penghasilan");
        }
        else if (Penghasilan >= 1000000 && Penghasilan < 2000000){
            double pajak = Penghasilan * 5/100;
            System.out.println("Pajak yang dibayarkan = Rp " + pajak);
        }
        else if (Penghasilan >= 2000000 && Penghasilan < 5000000){
            double pajak = Penghasilan * 10/100;
            System.out.println("Pajak yang dibayarkan = Rp " + pajak);
        }
        else{
            double pajak = Penghasilan * 20/100;
            System.out.println("Pajak yang dibayarkan = Rp " + pajak);
        }

        in.close();
    }
}
