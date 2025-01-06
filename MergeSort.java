public class MergeSort {
        public static void main(String[] args) {
            int arr[] = {1, 4, 1, 2, 7, 5, 2};
            mergeSort(arr, 0, arr.length - 1);
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
        public static void mergeSort(int arr [] ,int left ,int right){
            if(left<right){
                int mid = (left + right) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }
        public static void merge(int arr [] , int left, int mid, int right){
            int n1 = mid -left+1;
            int n2 =right-mid;
            int Larr [] = new int[n1];
            int Rarr [] = new int[n2];
            for(int i = 0; i < n1; i++){
                Larr[i] = arr[left + i];
            }
            for(int j = 0; j < n2; j++){
                Rarr[j] = arr[mid + 1 + j];
            }
            int i = 0, j = 0;
            int k = left;
            while(i<n1&&j<n2){
                if(Larr[i]<=Rarr[j]){
                    arr[k] = Larr[i];
                    i++;
                }else{
                    arr[k] = Rarr[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                arr[k] = Larr[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k] = Rarr[j];
                j++;
                k++;
            }
        }
}
