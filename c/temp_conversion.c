/* 

EXERCISE 1.5
print Fahrenheit - Celsius table 

*/

#include <stdio.h>

#define LOWER 0     /* lower limit of table */
#define UPPER 300  /* upper limit */
#define STEP 20    /* step size */

int main()
{
	int fahr;

	printf("\n\n");
	for( fahr = 0; fahr <= 300; fahr = fahr + 20)
	printf( "%3d %6.1f\n", fahr, (5.0/9.0) * (fahr - 32 ) );


//print the table in reverse order
	printf("\n\n");
	for( fahr = 300; fahr >= 0; fahr = fahr - 20)
	printf( "%3d %6.1f\n", fahr, (5.0/9.0) * (fahr - 32 ) );


//user constants in place of values
	printf("\n\n");
	for( fahr = LOWER; fahr <= UPPER; fahr = fahr + STEP)
	printf( "%3d %6.1f\n", fahr, (5.0/9.0) * (fahr - 32 ) );


}

