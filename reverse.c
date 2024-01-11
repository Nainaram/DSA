#include <stdio.h>
void main(){
    int arr[10] = { 1,2,3,4,5,6,7,8,9,10};
    int i;
    for(i = 0; i < 10; i++){
        printf("%d " ,arr[i]);
    }
    printf("\n");
     printf("reversed array as follows: \n");
    for( i = 9; i>=0;i--){
       
        printf("%d ",arr[i]);
    }
}