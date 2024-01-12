#include<stdio.h>
#define MAX 100
void main(){
    int a[MAX][MAX],b[MAX][MAX],product[MAX][MAX],i,j,k;
    int arows,acolumns,brow,bcolumn;
    int sum = 0;
    
    //part1
    printf("Enter the no of rows and columns in matrix a:\n");
    scanf("%d %d", &arows, &acolumns);
    
    printf("Enter the elements for matrix a:\n");
    for(i = 0; i < arows; i++){
        for(j = 0; j < acolumns; j++){
            scanf("%d", &a[i][j]);
        }
    }

    printf("Enter the no of rows and columns in matrix b:\n");
    scanf("%d %d", &brow, &bcolumn);

    if(acolumns != brow){
        printf("Sorry matrix multiplication is not possible!!!\n");
    }
    else{
        printf("Enter the elements of matrix b:\n");
        for(i = 0; i < brow; i++){
            for(j = 0; j < bcolumn; j++){
                scanf("%d", &b[i][j]);
            }
        }
    }

    // main logic of matrix multiplication
    for(i = 0; i < arows; i++){
        for(j = 0; j < bcolumn; j++){
            for(k = 0; k < acolumns; k++){
                sum += a[i][k] * b[k][j];
            }
            product[i][j] = sum;
            sum = 0;
        }
    }

    // Resultant matrix for the multiplied values
    printf("Resultant value: \n");
    for(i = 0; i < arows; i++){
        for(j = 0; j < bcolumn; j++){
            printf("%d ", product[i][j]);
        }
        printf("\n");
    }
}