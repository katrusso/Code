/* removes trailing blanks, tabs, and newlines from the end of a string, using break to exit from a loop when the rightmost non-blank, non-tab, non-newline is found. */

/* break stmt: provides an early exit from for, while, and do, just as from switch.
   A break causes the innermost enclosing loop or switch to be exited immediately. */

#include <stdio.h>
#include <string.h> /* used for strlen() */

int trim(char s[]);

int main(void)
{  
  char mystring[12] = "kathleen   ";
  printf("original size of mystring: 12\n");
  int updated_sz_of_mystringarray = trim(mystring);
  printf("updated size of mystring array after trim: %d\n", updated_sz_of_mystringarray);
  return 0;
}


/* strlen returns the length of the string.
   The for loop starts at the end and scans backwards looking for the first character that is not a blank, tab, or newline. The loop is broken when one is found, or when n becomes negative (that is, when the entire string has been scanned). */
int trim(char s[])
{
  int n, i;

  for ( n = strlen(s) - 1; n >= 0; n-- )
    if ( s[n] != ' ' && s[n] != '\t' && s[n] != '\n')
      break;
  s[n + 1] = '\0';

  printf("updated mystring: ");
  for ( i=0; i<=n; i++)
    printf("%c", s[i]);
  printf("\n");
  return n+2; /* size of the array is n (ending index value containing a character -- "7" for an 8 char word) + 1 for the: \0 */
}
