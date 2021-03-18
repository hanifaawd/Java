import java.util.Vector;
import java.util.Scanner;

public class posttest1Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Vector<Integer> nilai = new Vector<Integer>();
        Vector<String> nama = new Vector<String>();
        String pilihan = " ";

        int idx = 0;
        do{
            System.out.print("Nama Mahasiswa : ");
            nama.add(sc.next());
            System.out.print("Nilai Mahasiswa : ");
            nilai.add(sc.nextInt());
            System.out.print("Input lagi (y/t) : ");
            pilihan = sc.next();
            idx++;
        } while (pilihan.equals("Y") || pilihan.equals("y"));
        
        System.out.println("\n--------------------------\n");
        System.out.println("List Nilai Mahasiswa = " + nilai);
        System.out.println("List Nama Mahasiswa = " + nama);
        System.out.println("Rata-Rata Nilai = " + calculateMean(nilai, idx));
        System.out.println("Nilai Max = " + nilai.get(findMax(nilai, idx)));
        System.out.println("Nilai Min = " + nilai.get(findMin(nilai, idx)));
        System.out.println("Standar Deviasi = " + calculateSD(nilai, idx));
        System.out.println("Nama Nilai Tertinggi = " + nama.get(findMax(nilai, idx)));
        System.out.println("Nama Nilai Terendah = " + nama.get(findMin(nilai, idx)));
        sc.close();
    }

    // mencari mean
    public static double calculateMean(Vector<Integer> nilai, int numElement) {
        int total = 0;
        double average = 0.0;

        for(int i = 0; i < numElement; i++){
            total = total + nilai.get(i);
        }
        average =  (double) total / (double) numElement;

        return(average);
    }

    // mencari index nilai max
    public static int findMax(Vector<Integer> nilai, int numElement) {
        int max = nilai.get(0);
        int idx = 0;

        for(int i = 0; i < numElement; i++) {
            if(nilai.get(i) > max) {
                max = nilai.get(i);
                idx = i;
            }
        }
        return(idx);
    }
    
    // mencari index nilai min
    public static int findMin(Vector<Integer> nilai, int numElement) {
        int min = nilai.get(0);
        int idx = 0;

        for(int i = 0; i < numElement; i++) {
            if(nilai.get(i) < min) {
                min = nilai.get(i);
                idx = i;
            }
        }
        return(idx);
    }

    // mencari standar deviasi
    public static double calculateSD(Vector<Integer> nilai, int numElement) {
        double average = calculateMean(nilai, numElement);
        double standardDeviation = 0.0, variance = 0.0, sum = 0.0;

        // step 1 - menghitung varian
        for(int i = 0; i < numElement; i++){
            sum = sum + Math.pow((nilai.get(i) - average), 2);
        }
        variance = sum / numElement;

        // step 2 - menghitung standar deviasi
        standardDeviation = Math.sqrt(variance);

        return standardDeviation;
    }
}
