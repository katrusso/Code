/* use global variables to elimitate function parameters
   declare / create two new fns
   char arrays
   read a set of text lines and print the longest line 

algo:
 while (there's another line)  <-- getline fn
     if (it's longer than the prev longest)
         save it                  <-- copy fn
	 save its length
 print the longest line

*/

#include <stdio.h>
#define MAXLINE 1000 /*max input line size */

/* GLOBAL VAR Definitions (storage allocated); states type and allocates storage */
int max;             // max length seen so far 
char line[MAXLINE];     //current input line
char longest[MAXLINE]; //longest line saved here


int getLine(void);   /* fn declarations; the word void is used for an explicitly empty list */
void copy(void);

int main(void)
{
  int len;                  //current line length
  extern int max;  /* declarations (no storage allocated): DECLARE GLOBAL VARS IN EACH FN THAT USES THEM */
  extern char longest[]; /* before a fn can use an external var, the var must be made known to the fn */

  max=0;
  while((len = getLine())>0)
    if( len > max ){
	max = len;
	copy();  //copy current "line" to "longest" line char array
      }
  if ( max > 0 ) //there was a line
    printf( "%s", longest );

  return 0;
}

int getLine(void ) /* read a line into s, return length */
{
  int c, i;
  extern char line[];  /* DECLARE GLOBAL VARS IN EACH FN THAT USES THEM */

  for(i = 0; i < MAXLINE-1 && (c=getchar()) != EOF && c != '\n'; ++i )
    line[i] = c;

  if( c == '\n' ){
      line[i] = c; /* these last two lines can be replaced with: line[i++] = c; */
      ++i;
    }

  line[i] = '\0';
  return i;
}

void copy(void) /* copy "from" array into "to" array */
{
  int i;
  extern char line[], longest[];  /* DECLARE GLOBAL VARS IN EACH FN THAT USES THEM */

  i = 0; 
  while((longest[i] = line[i]) != '\0')
    ++i;
}
  
  

