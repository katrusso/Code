/*C program to check whether a number entered by user is prime or not using function with no arguments and no return value*/
#include <stdio.h>
void prime();
int main(){
  while(1)
    prime();      //No argument is passed to prime().
  return 0;
}
void prime(){  
/* There is no return value to calling function main(). Hence, return type of prime() is void */
    int num,i,flag=0;
    printf("Enter positive integer enter to check:");
    scanf("%d",&num);
    for(i=2;i<=num/2;++i){
	printf("i is: %d\n", i);
        if(num%i==0){
             flag=1;
         }
      }
    if (flag==1)
        printf("%d is not prime\n",num);
    else
       printf("%d is prime\n",num);  
    }
