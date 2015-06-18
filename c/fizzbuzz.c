/* Write a program that prints the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number, 
and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”.*/

#include <stdio.h>

int main()
{
	int modThree;
	int modFive;

	for( int i = 1; i < 100; i++ )
	{
		modThree = i % 3;
		modFive = i % 5;

		if( modThree == 0 && modFive == 0)
			printf( "FizzBuzz\n" );
		else if( modThree == 0 )
			printf( "Fizz\n" );
		else if ( modFive == 0 )
			printf( "Buzz\n" );
		else
			printf( "%d\n", i );
	}
	return 0;
}

