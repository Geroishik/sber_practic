package base;
import java.util.Arrays;

public class BaseHW {
    private static void sevenSequence(){
        for(int sevenMult = 7; sevenMult <= 98; sevenMult += 7 ){
            System.out.printf("%d ", sevenMult);
        }
    }

    private static void maxAndAverageArrayElem(){
        final int size_arr = 10;
        double[] randomArr = new double[size_arr];
        for (int indexArr = 0; indexArr < size_arr; indexArr++){
            randomArr[indexArr] = Math.random();
        }
        final double max_arr = Arrays.stream(randomArr).max().getAsDouble();
        final double average_arr = Arrays.stream(randomArr).average().getAsDouble();
        System.out.println("Максимальный элемент массива = " + max_arr);
        System.out.print("Среднее значение массива = " + average_arr);
    }

    private static boolean isPrime(int num){
        int count = 1;
        for (int divider = 2; divider <= 100; divider++){
            if (num % divider == 0){
                count++;
            }
        }

        return count == 2;
    }

    private static void searchPrimeNumbers(){
        final int start_check_prime = 2;
        final int end_check_prime = 100;
        for (int num_check_prime = start_check_prime; num_check_prime <= end_check_prime; num_check_prime++){
            if (isPrime(num_check_prime)){
                System.out.printf("%d ", num_check_prime);
            }
        }
    }

    private static void starsDraw(){
        final int line_col = 3;
        final int column_col = 5;
        for (int line = 1; line <= line_col; line++){
            for(int column = 1; column <= column_col; column++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Задача 1:");
        sevenSequence();
        System.out.println();
        System.out.println("Задача 2:");
        maxAndAverageArrayElem();
        System.out.println();
        System.out.println("Задача 3:");
        searchPrimeNumbers();
        System.out.println();
        System.out.println("Задача 4:");
        starsDraw();
    }

}
