// this is code for the insertion
#include <stdio.h>
 void display(int arr[] , int n){
    for(int i = 0; i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    printf(" \n");
 }
 int IndInsertion(int arr[] , int size, int element, int capacity,int index){
    // code for the  insert an element in particular index in an array
    if(size>=capacity){
        return -1;
    }
    for(int i = size-1; i >= index;i--){
        arr[i+1]=arr[i];
    }
    arr[index] = element;
    }
 int main(){
    int arr[100] = {1,2,3,4,45,67,88};
    int size = 7,element = 76,index =6;
    display(arr,size);
    IndInsertion(arr,size,element,100,index);
    size +=1;
    display(arr,size);
    return 0;
 }