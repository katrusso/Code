/* modulus example:
a year is a leap year if it is divisible by 4, but not by 100, except that years divisible by 400 are leap years.
*/

#include <stdio.h>

int main(void)
{
  int year;

  /* The scanf() function requires the memory address of the variable to which you want to save the input value. While pointers are possible here, the simple technique is to use the address-of operator, &.*/
  
  printf("Enter a year: ");
  scanf("%d", &year);
  
  if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
    printf("%d is a leap year\n", year);
  else
    printf("The year %d is not a leap year.\n", year);
    
  return 0;
}
