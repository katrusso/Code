/* count chars from input using a for loop */
/* Hit Ctrl + D to signal end-of-file condition */


#include <stdio.h>
#include <stdlib.h>

int main()
{
  double nc;

  for( nc=0; getchar()!=EOF; ++nc)
    ;
  printf("%.0f\n", nc);

  return EXIT_SUCCESS;
}
