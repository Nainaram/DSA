import java.util.Arrays;
public class InsertionSort{
    public static void Insertionsort(int [] array){
        int n = array.length;
        // outer loop for number elements in the loop
        for(int i = 1; i < n; i++){   
        // choose the key to be inserted
        int key = array[i];
            int j =i -1;
            // inner loop for shifting key elements and getting space for key
            while( j>=0&& array[j] > key){
                // insert keys into its correct position
                array[j + 1] =array[j];
                j--;

            }
            array[j+1] = key;}}
            public static void main(String[] args) {
                int [] array ={23,45,34,12,56,676,65};
                System.out.println("Original array:" + Arrays.toString(array));
               // call the insert method
                Insertionsort(array);
                // print the array
                System.err.println("Sorted array:" + Arrays.toString(array
                ));
            }
    
}