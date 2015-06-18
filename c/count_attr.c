/* count the lines, words, and characters in the input */

#include <stdio.h>
#include <stdlib.h>

#define IN 1  /* inside a word */
#define OUT 0 /* outside a word */

int main(void)
{
  int c, nl, nw, nc, state; /* state records whether the program is currently in a word or not */

  state = OUT;
  nl=nw=nc=0;
  while ( (c = getchar() ) != EOF )
    {
      ++nc; /*increments char count */
      if ( c == '\n')
	++nl; /* increments new line count */
      if ( c == ' ' || c == '\n' || c == '\t')
	state = OUT; /* indicates the cursor is examining a char that is not in a word */
      else if (state == OUT )
	{
	  state = IN; /* change the state to being "in", where the cursor is examining a char that is part of a word */
	  ++nw; /*increment the word count by 1 */
	}
    }
  printf ( "%d %d %d\n", nl, nw, nc); /*outputs # of new lines, # words, # chars (including spaces) */
  return EXIT_SUCCESS;
}
