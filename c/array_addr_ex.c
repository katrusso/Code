#include <stdio.h>
int main()
{
   char c[4];
   int i;
   for(i=0;i<4;++i){
      printf("Address of c[%d]=%x\n",i,&c[i]);
   }
   return 0;
}

/*
Address of c[0]=59159928
Address of c[1]=59159929
Address of c[2]=5915992a
Address of c[3]=5915992b
 */
