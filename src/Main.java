
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {



        Integer[] secondArray = sortIntegers();

        for(int i = 0; i < secondArray.length; i++){
            System.out.println(secondArray[i]);
        }
    }

    public static Integer[] getIntegers(Integer number) {
        System.out.println("Please enter " + number + " integer values. \r");
        Integer[] values = new Integer[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
            return values;
    }

   public static Integer[] printArray() {

       return getIntegers(5);
   }

   public static Integer[] sortIntegers() {

        Integer[] integerList = printArray();
       Arrays.sort(integerList, Collections.reverseOrder());

       return integerList;
   }

}