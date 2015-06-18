/*Program to demonstrate the working of user defined function*/
#include <stdio.h>
int add(int a, int b);           //function prototype(declaration)
int main(){
     int num1,num2,sum;
     printf("Enters two number to add\n");
     scanf("%d %d",&num1,&num2);
     sum=add(num1,num2);         //function call 
     printf("sum=%d",sum); 
     return 0;
}
int add(int a,int b)            //function declarator
{             
/* Start of function definition. */
     int add;
     add=a+b;
     return add;                  //return statement of function 
/* End of function definition. */   
}                                  
