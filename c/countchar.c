/* Counts the characters in the input */
/* Hit Ctrl + D to signal end-of-file condition */

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
