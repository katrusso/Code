/* 
Exercise 1-8: modified
Write a program to remove blanks, tabs, newlines
*/

#include <stdio.h>
struct bool{
	int TRUE = 1;
	int FALSE = 0;
};

#define INPUT_SIZE 50
int main()
{
	char input[INPUT_SIZE];
	struct bool space = tab = newline = FALSE; 

	printf( "Enter some text: ");
	fgets( input, INPUT_SIZE, stdin );
	
	printf( "Input: %s\n. W/o whitespace: ", input);

	for( int i = 0; i < INPUT_SIZE; i++){	
		if( input[i] == ' ' ) space = TRUE;
		if( input[i] == '\n' ) newline = TRUE;
		if( input[i] == '\t' ) tab = TRUE;

		if(!space && !newline && !tab) { printf( "%c", input[i] ); }		
	}
	return 0;
}