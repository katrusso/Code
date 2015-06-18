#include <stdio.h>
#include <stdlib.h>

int strlen(char mystring[]);

int main(void)
{
  int length;
  char s[] = "This is my sentence";
  
  length = strlen(s);
  printf("string length is: %d\n", length); /* returns length = 19 -- doesn't include terminating char \0 --> ergo, 20 total */
  return EXIT_SUCCESS;
}

int strlen(char mystring[])
{
  int i;
  i = 0;

  while( mystring[i] != '\0')
    ++i;
  return i;
}
