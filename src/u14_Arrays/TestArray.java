package u14_Arrays;
import java.util.Arrays;
/**
 * Created by Sven on 2018/3/29.
 */
public class TestArray {

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list){
        int[] result = new int[list.length];

        for(int i = 0,j = result.length-1; i < list.length; i++,j--){
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args){
        double[] myList = {1.9,2.9,3.4,3.5};

        // Print all the array elements
        for(int i = 0;i < myList.length; i++){
            System.out.println(myList[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for(int i = 0;i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total is " + total);
        // Finding the largest element
        double max = myList[0];
        for(int i = 1; i < myList.length; i++){
            if(myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);

        System.out.println("for loop: ");
        // Print all the array elements
        for(double element:myList){
            System.out.println(element);
        }

        // Call the printArray
        printArray(new int[]{3,4,2,5,1,0});
    }
}
