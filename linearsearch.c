#include<stdio.h>
int linearsearch(int arr[], int size,int element){
    for( int i =0; i < size; i++){
        if(arr[i] == element){
            return i ;
        }
    }
    return -1;
}

int main(){
    int arr[100] = { 1,2,3,3,4,54,43,34,332,34,45,34,4};
    int size = 13;
    int element = 332;
    int searchIndex =   linearsearch(arr,size,element);
    printf(" the element %d is found at the index %d \n",element,searchIndex);
    return 0;
}