/* A pair of expressions separated by comma is evaluated left to right, and the type and value of the result are the type and value of the right operand.

Thus in a for stmt, it is possible to place multiple expressions in the var parts, for example to process two indices in parallel.

*/
/* reverses a string in place

HOW DO I RETURN THE REVERSE STRING ARRAY SO THAT I CAN COMPARE IT TO THE ORIGINAL ARRAY TO SEE IF IT'S A PALINDROME? */

#include <stdio.h>
#include <string.h>

void reverse(char s[]);  /* reverses a string in place */

int main(void)
{
  char mystring[9] = "kathleen";
  reverse(mystring);
  return 0;
}

void reverse(char s[])
{
  int c, i, j;

  for ( i = 0, j = strlen(s) - 1; i < j; i++, j-- )
    c = s[i], s[i] = s[j], s[j] = c; /* a comma can be used here to express the exchange of elements as a single operation */

  for (i = 0; i <strlen(s); i++)
    printf("%c", s[i]);
  printf("\n");
}
