#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void)
{
  char s[] = "This is my sentence";
  
  printf("string length is: %lu\n", strlen(s)); /* returns length = 19; strlen() returns the # of chars that precede the
     terminating NUL character. */
  return EXIT_SUCCESS;
}
