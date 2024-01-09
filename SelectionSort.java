import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int [] array){
        int n = array.length;
        // outer loop for number elements in the loop
        for(int i = 1; i < n; i++){   
                int smallest = i;
                for (int j = i +1; j <n; j++){
                    if(array[smallest]>array[j]){
                        smallest = j;
                    }
                    }
                    int temp = array[smallest];
                    array[smallest]= array[i];
                    array[i] = temp;
                }
                }

        
            public static void main(String[] args) {
                int [] array ={45,34,12,56,676,65};
                System.out.println("Original array:" + Arrays.toString(array));
               // call the insert method
                SelectionSort(array);
                // print the array
                System.err.println("Sorted array:" + Arrays.toString(array
                ));
            }
    
}
    

