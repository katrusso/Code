/*

EXERCISE 1-6 Verify that the expr getchar() != EOF is 0 or 1
EXERCISE 1-7 Write a program to print the value of EOF

*/

#include <stdio.h>

int main()
{
	int c;

	/* while getchar has a character to read it does not return the end-of-file and 
	getchar() ) != EOF is true so "1" is assigned to c.

	when the program encounters the end-of-file, the expr is false, then 0 is assigned 
	to c and the loop terminates.
	*/
	while( ( c = getchar() ) != EOF)
		printf( "%d\n", c); 
	printf( "%d - at EOF\n", c);
}