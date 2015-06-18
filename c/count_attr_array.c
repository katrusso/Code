/* count the # of occurrences of ea digit, white space char (blank, tab, newline), and of all other chars and store the number of occurrences of each digit in an array */

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  int c, i, nwhite, nother;
  int ndigit[10];

  nwhite = nother = 0;
  for ( i = 0; i < 10; ++i )
    ndigit[i] = 0;  /* initialize the array to 10 zero values */

  while ( ( c = getchar() ) != EOF )
    if ( c >= '0' && c <= '9' ) /*test whether c is a digit (ASCII representation of a digit 0-9 is itself) */
      ++ndigit[ c-'0' ];  /* if it is, the numerical value of it is c - '0' */
    else if ( c == ' ' || c == '\n' || c == '\t' )
      ++nwhite;
    else
      ++nother;
  
  printf ( " digits = ");
  for ( i = 0; i < 10; ++i )
    printf( " %d", ndigit[i] );

  printf(", white space = %d, other = %d\n", nwhite, nother);
  
  return EXIT_SUCCESS;
}
