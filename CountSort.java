public class CountSort{
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 7, 5, 2};
         countSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void countSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] count = new int[max + 1];
        
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i= 0;i<=max;i++){
            while(count[i] > 0){
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}