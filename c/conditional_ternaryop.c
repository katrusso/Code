/* Conditional expressions
 the statement:
    if ( a > b )
       z = a;
    else
       z = b;

computers the maximum of a and b and stores it in z

This is the same as:

z = (a > b ) ? a : b;    

which can also be stored as z = max(a,b) 
 */

#include <stdio.h>

int main(void)
{
  #if 0
  for( i = 0; i < n; i++)
    printf("%6d%c", a[i], ( i % 10 == 9 || i == n - 1 ) ? '\n' : ' ');

  /* this loop prints n elements of an array, 10 per line, with each column separated by one blank, and with each line (including the last, terminated by a new line.*/

  #endif
  int n;  //number_of_items
  printf("Enter the number of items you have: ");
  scanf("%d", &n); //reminder: scanf() requires a pointer to where the data is stored (if it's not implicit).
  
  printf ( "You have %d item%s.\n", n, n == 1 ? "" : "s");  
  return 0;
}
