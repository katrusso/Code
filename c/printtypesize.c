#include <stdio.h>

int main(void)
{
  printf("sizeof int: %lu\n", 1*sizeof(int));
  printf("sizeof char: %lu\n", 1*sizeof(char));
  printf("sizeof string: %lu\n", 1*sizeof("5"));

  return 0;
  
}
