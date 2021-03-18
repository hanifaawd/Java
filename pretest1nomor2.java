import java.util.Random;

public class pretest1nomor2 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int total = 0;
        Random rn = new Random();

        //initialize array - 1000 elements
        for(int i = 0; i < 1000; i++){
            array[i] = rn.nextInt(10000) + 0;
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                total = total + array[i];
            }
        }
        System.out.println("Total = " + total);
    }
}
