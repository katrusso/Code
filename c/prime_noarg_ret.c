/*C program to check whether a number entered by user is prime or not using function with no arguments but having return value */
#include <stdio.h>
int input();
int main(){
    int num,i,flag = 0;
    num=input();     /* No argument is passed to input() */
    for(i=2; i<=num/2; ++i){
    if(num%i==0){
        flag = 1;
        break;
    }
    }
    if(flag == 1)
        printf("%d is not prime",num);
    else
        printf("%d is prime", num);
    return 0;
}
int input(){   /* Integer value is returned from input() to calling function */
    int n;
    printf("Enter positive integer to check:\n");
    scanf("%d",&n);
    return n;
}
