/* Counts the characters in the input */

#include <stdio.h>
#include <stdlib.h>

int main()
{
  long nc=0;

  while(getchar() != EOF)
      ++nc;

  printf("%ld\n", nc);
    
  return EXIT_SUCCESS;
}
