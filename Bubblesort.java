// java program for bubble sort

import java.util.Arrays;

public class Bubblesort{
     static void bubblesort( int [] array ){
        int n = array.length;
        // outer loop to check the passes through indexes of array
        for(int i = 0; i < n ; i++){
            // inner loop  to check and compare the elemens to sorting
            for(int j = 0; j < n -i-1; j++){
                    if(array[j] > array[j+1]){
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }

            }
        }


    }
    public static void main(String[] args) {
    
        int array[]= {45,23,56,44,23,12};
         bubblesort(array);
          // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

    }
    
}