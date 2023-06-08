import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        boolean lessThanZero = false;
        numbers[1] = 2.7;
        numbers[2] = 3.3;
        numbers[3] = -6.1;
        numbers[4] = 3.9;
        numbers[5] = 7.7;
        numbers[6] = -9.4;
        numbers[7] = 6.6;
        numbers[8] = 100.012;
        numbers[9] = -87.67;
        numbers[10] = 65.9;
        numbers[11] = 67.11;
        numbers[12] = -12.13;
        numbers[13] = 4.12;
        numbers[14] = 22.3;
        double obshiy = 0 ;
        int dlinna = 0;
        for (double currentElem : numbers) {
            if (currentElem < 0) {
                lessThanZero = true;
            }
            if (lessThanZero && currentElem > 0 ){
                obshiy = obshiy + currentElem;
                dlinna = dlinna + 1;
            }
        }
        System.out.println(obshiy / dlinna);

            double [] mas = numbers;

            boolean isSorted = false;
            double buf;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < mas.length-1; i++) {
                    if(mas[i] > mas[i+1]){
                        isSorted = false;

                        buf = mas[i];
                        mas[i] = mas[i+1];
                        mas[i+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(mas));

    }
}


