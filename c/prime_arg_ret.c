/* Program to check whether a number entered by user is prime or not using function with argument and return value */
#include <stdio.h>
int check(int n);
int main(){
    int num,num_check=0;
    printf("Enter positive enter to check:\n");
    scanf("%d",&num);
    num_check=check(num); /* Argument num is passed to check() function. */
    if(num_check==1)
       printf("%d is not prime",num);
    else
       printf("%d is prime",num);
    return 0;
}
int check(int n){   
/* Integer value is returned from function check() */ 
    int i;
    for(i=2;i<=n/2;++i){
    if(n%i==0)
        return 1;
}
   return 0;
}
