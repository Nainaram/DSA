#include<stdio.h>
int main(){
    int i,j,k;
    int arr[2][2][3] ={{{1,2,3},{4,5,6}},{{1,2,3},{4,5,6}}};
    for(i = 0; i < 2; i++){
        for(j = 0; j < 2; j++){
            for(k = 0; k < 3; k++){
              
            printf("%d " , arr[i][j][k]);}
           
        }
    }
    }

