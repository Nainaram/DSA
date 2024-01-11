#include<stdio.h>
int main(){
    int i,j,SUM =0;
    int arr[5][5] ={{1,2,3,4,5},{6,1,2,3,4},{5,6,1,2,3},{4,5,6,7,1},{2,3,4,5,6}};
    printf("rowsum:");
    for(i = 0; i < 5; i++){
        for(j = 0; j < 5; j++){
            SUM = SUM+arr[i][j];
         } 
         printf("%d " , SUM);
         SUM = 0;
    }
        printf(" \n column sum:");
    for(j = 0; j < 5; j++){
        for(i = 0; i < 5; i++){
            SUM = SUM+arr[i][j];
         } 
         printf("%d " , SUM);
         SUM = 0;
    }
}