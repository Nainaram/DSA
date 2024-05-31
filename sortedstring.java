public class sortedstring {
    public static boolean isSorted(int arr[],int idx){
        if(idx == arr.length-1){
            return true;
        }
        // if(arr[idx]>=arr[idx+1]){
        //     // array is sorted
        //     return   false;
        // }
        // else{return  isSorted(arr, idx+1);}
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }
        else{
            return false;
        }
    } 
    public static void main(String[] args) {
        int [] array = { 2,3,5,6,7};
        System.out.println(isSorted(array, 0));
    
}
    
}
