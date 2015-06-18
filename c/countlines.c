/* count the lines in input; since input text stream appears as a seq of lines, each terminated by a new line, count the lines by counting the newlines */

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  int c, nl=0; 

  while ( (c=getchar()) != EOF)
    if ( c =='\n')
      ++nl;
  printf("%d\n", nl);
  return EXIT_SUCCESS;
}
