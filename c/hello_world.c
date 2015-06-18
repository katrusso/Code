#include <stdio.h>

//C does not have a boolean type; usually defined like this instead:
#define BOOL char
#define FALSE 0
#define TRUE 1

int main(){

int a=0; 
float b=1.5;
double c=2.25; 
double sum=a+b+c;
	
	printf("\nHello, World\n");
	printf("the sum of a, b, c is %.2f\n", sum); //prints float out to 2 decimal places
	
//ARRAYS
// - can only have one var type b/c they are implemented as a seq of values in memory
int numbers[10]; //defines an array of 10 integers
	numbers[0] = 10;	//populate the array
	numbers[1] = 20;
	numbers[2] = 30;
	numbers[3] = 40;
	numbers[4] = 50;
	numbers[5] = 60;
	numbers[6] = 70;	
	numbers[7] = 80; 
	numbers[8] = 90;	
	numbers[9] = 100;	

printf("The 7th number in the array is %d\n", numbers[6]);	//print the 7th # in the array (index = 6)

//STRINGS
// - in C, strings are actually arrays of characters
// - use pointers to a character array to define a simple string

	char * guy_name = "John Smith"; //creates a string which we can only use for reading
	int age = 27;
	char other_name[] = "Jane Smith"; //creates a local char array that can be manipulated
	/* the empty brackets tell the compiler to calculate the size of the array automatically
	
	== char name[11] = "Jane Smith";
	The name itself is 10 chars. We need to add one for the string termination; a special
	character (equal to 0) which indicates the end of the string.
	
	The end of the string is marked bc the prgrm doesn't know the length of the string; only the compiler knows it.
	*/
	printf("%s is %d years old.\n", guy_name, age); //prints "John Smith is 27 years old."
	
/* strncmp() compares two strings, returns 0 if equal, else some number is not equal
args: 2 strings to be compared, and the max comparison length

Alternate fn (not recommended): strcmp */

//STRING COMPARISON
	if (strncmp(guy_name, "John", 4)==0){ //compares first 4 letters or john and value stored in the var name
		printf("Hello, John!\n");     //"0" indicates the values are the same
	}else{
		printf("You are not John!");
	}
	
  char * first_name = "John";
  char last_name[4] = "Doe";
  char name[100];

  if (strncmp(first_name, "John", 5)!= 0) return 1;
  if (strncmp(last_name, "Doe", 4)!= 0) return 1;

  last_name[0] = 'B';
  sprintf(name, "%s %s", first_name, last_name);
  if (strncmp(name, "John Boe", 100) == 0) {
      printf("Done!\n");
  }


//FOR LOOPS
/*  - code block that runs multiple times
	- requires iterator var, i
	
	- initialize the iterator var using an initial value
	- check if the iterator has reached its final value
	- increase the iterator
*/
	int i;
	
	for(i=0; i<10; i++){
		printf("%d\n", i);
	}
	
//iterate on array values
	int array[10]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int array_sum = 0;
	
	
	for(i=0; i<10; i++){
		array_sum += array[i];
	}
	
	//sum now contains a[0] + a[1] + ...+ a[9]
	printf("Sum of the array is %d\n", array_sum);
	



	return 0;
}