//Program to find the sum of six numbers with arrays and pointers.
#include <stdio.h>
int main()
{
  int i,class[6],sum=0;
  printf("Enter 6 numbers:\n");
  for(i=0;i<6;++i){
      scanf("%d",(class+i)); // (class+i) is equivalent to &class[i]
      sum += *(class+i); // *(class+i) is equivalent to class[i]
  }
  printf("Sum=%d",sum);
  return 0;
}

/*
Enter 6 numbers:
2
3
4
5
3
4
Sum=21
 */
