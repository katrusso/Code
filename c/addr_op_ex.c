/* Example to demonstrate use of reference operator in C programming. 
value 5 is stored in the memory location 2686778.
var is just the name given to that location.
*/
#include <stdio.h>
int main(){
  int var=5;
  printf("Value: %d\n",var);
  printf("Address: %d",&var);  //Notice, the ampersand(&) before var.
  return 0;
}
