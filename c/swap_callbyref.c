/* C Program to swap two numbers using pointers and function. */
#include <stdio.h>
void swap(int *a,int *b);
int main(){
  int num1=5,num2=10;
  swap(&num1,&num2);  /* address of num1 and num2 is passed to swap function */
  printf("Number1 = %d\n",num1);
  printf("Number2 = %d\n",num2);
  return 0;
}
void swap(int *a,int *b){ /* pointer a and b points to address of num1 and num2 respectively */
  int temp;
  temp=*a;
  *a=*b;
  *b=temp;
}

/*
Number1 = 10
Number2 = 5


The address of memory location num1 and num2 are passed to function and the pointers *a and *b accept those values. So, the pointer a and b points to address of num1 and num2 respectively. When, the value of pointer are changed, the value in memory location also changed correspondingly. Hence, change made to *a and *b was reflected in num1 and num2 in main function.

This technique is known as call by reference in C programming.
 */
