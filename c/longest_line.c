/* declare / create two new fns
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

int getLine(char line[], int maxline);   /* fn declarations */
void copy(char to[], char from[]);

int main(void)
{
  int len;                  //current line length
  int max = 0;             // max length seen so far 
  char line[MAXLINE];     //current input line
  char longest[MAXLINE]; //longest line saved here

  while((len = getLine(line, MAXLINE))>0)
    if( len > max ){
	max = len;
	copy(longest, line);  //copy current "line" to "longest" line char array
      }
  if ( max > 0 ) //there was a line
    printf( "%s", longest );

  return 0;
}

int getLine(char s[], int lim ) /* read a line into s, return length */
{
  int c, i;

  for(i = 0; i < lim-1 && (c=getchar()) != EOF && c != '\n'; ++i ) /*before reading a new character it is necessary to check that there is room to store it in array s, so the test i < (lim -1) must be made first */
    s[i] = c;

  if( c == '\n' ){
    s[i] = c;  /* these last two lines can be replaced with: s[i++] = c; */
      ++i;
    }

  s[i] = '\0';
  return i;
}

void copy(char to[], char from[]) /* copy "from" array into "to" array */
{
  int i;

  i = 0; 
  while((to[i] = from[i]) != '\0')
    ++i;
}
  
  

