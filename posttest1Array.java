import java.util.Scanner;

public class posttest1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nilai[] = new int[100];
        String[] nama = new String[100];
        String pilihan = " ";

        int idx = 0;
        do{
            System.out.print("Nama Mahasiswa : ");
            nama[idx] = sc.next();
            System.out.print("Nilai Mahasiswa : ");
            nilai[idx] = sc.nextInt();
            System.out.print("Input lagi (y/t) : ");
            pilihan = sc.next();
            idx++;
        } while (pilihan.equals("Y") || pilihan.equals("y"));
        
        System.out.println("\n--------------------------\n");
        System.out.println("Rata-Rata Nilai = " + calculateMean(nilai, idx));
        System.out.println("Nilai Max = " + nilai[findMax(nilai, idx)]);
        System.out.println("Nilai Min = " + nilai[findMin(nilai, idx)]);
        System.out.println("Standar Deviasi = " + calculateSD(nilai, idx));
        System.out.println("Nama Nilai Tertinggi = " + nama[findMax(nilai, idx)]);
        System.out.println("Nama Nilai Terendah = " + nama[findMin(nilai, idx)]);
        sc.close();
    }

    // mencari mean
    public static double calculateMean(int nilai[], int numElement) {
        int total = 0;
        double average = 0.0;

        for(int i = 0; i < numElement; i++){
            total = total + nilai[i];
        }
        average =  (double) total / (double) numElement;

        return(average);
    }

    // mencari index nilai max
    public static int findMax(int nilai[], int numElement) {
        int max = nilai[0];
        int idx = 0;

        for(int i = 0; i < numElement; i++) {
            if(nilai[i] > max) {
                max = nilai[i];
                idx = i;
            }
        }
        return(idx);
    }
    
    // mencari index nilai min
    public static int findMin(int nilai[], int numElement) {
        int min = nilai[0];
        int idx = 0;

        for(int i = 0; i < numElement; i++) {
            if(nilai[i] < min) {
                min = nilai[i];
                idx = i;
            }
        }
        return(idx);
    }

    // mencari standar deviasi
    public static double calculateSD(int nilai[], int numElement) {
        double average = calculateMean(nilai, numElement);
        double standardDeviation = 0.0, variance = 0.0, sum = 0.0;

        // step 1 - menghitung varian
        for(int i = 0; i < numElement; i++){
            sum = sum + Math.pow((nilai[i] - average), 2);
        }
        variance = sum / numElement;

        // step 2 - menghitung standar deviasi
        standardDeviation = Math.sqrt(variance);

        return standardDeviation;
    }
}