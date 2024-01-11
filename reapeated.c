#include <stdio.h>
void main(){
    int seen[10] ={0};
    int num;
 printf(" enter the number \n");
 scanf("%d",&num);
 int rem;
 while(num > 0){
    rem = num % 10;
    if(seen[rem]==1)
    break;
    seen[rem]=1;
    num = num/10;
 }
 if(num > 0){
    printf("yes");
 }
 else
    printf("no");
}