/*Program to check whether a number entered by user is prime or not using function with arguments and no return value */
#include <stdio.h>
void check_display(int n);
int main(){
    int num;
    printf("Enter positive enter to check:\n");
    scanf("%d",&num);
    check_display(num);  /* Argument num is passed to function. */
    return 0;
}
void check_display(int n){     
/* There is no return value to calling function. Hence, return type of function is void. */
    int i, flag = 0;
for(i=2; i<=n/2; ++i){
    if(n%i==0){
        flag = 1;
        break;
    }
    }
    if(flag == 1)
        printf("%d is not prime",n);
    else
        printf("%d is prime", n);
}
