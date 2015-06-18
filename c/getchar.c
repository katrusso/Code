/* removes an individual char from the input and outputs it to the terminal */
/* Hit Ctrl + D to signal end-of-file condition */


#include <stdio.h>
#include <stdlib.h> /* needed for EXIT_SUCCESS */

int main()
{
  int c;

  while ((c=getchar()) != EOF)  /*getchar converts char into an unsigned int*/
    {
      printf("c is: %d\n ", c);
      putchar(c);  /*removes character from the front of the string; prints the character to the terminal*/
      printf("\n");
    }
  
  return EXIT_SUCCESS;
}
  
/* to run in terminal: 
   gcc -Wall getchar.c
   ./a.out
*/
