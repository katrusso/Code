/* Convert string to its numeric equivalent;
it also copes with the optional leading white space and optional + or - sign */

#include <stdio.h>
#include <ctype.h>

/* atoi: convert s to int */
int atoi(char s[]);

int main(void)
{
  char s[10] = " -9998887";
  int i = atoi(s);

  printf("%s can be converted to the integer: %d\n", s, i);
  printf("size of array s is: %lu\n", sizeof(s));
  printf("size of int i is: %lu\n", sizeof(i));
  
  return 0;
}

int atoi(char s[])
{
  int i, n, sign;

  for ( i = 0; isspace(s[i]); i++) /* skip white space */
      ;
    
  sign = (s[i] == '-') ? -1 : 1;
  if (s[i] == '+' || s[i] == '-') /* skip sign */
      i++;
  for (n = 0; isdigit (s[i]); i++)
    n = 10 * n + (s[i] - '0');

  return sign * n;
}
