/* POINTERS EXAMPLE */
#include <stdio.h>

int main(void)
{
  double *dp, atof(char *); /* an expr *dp and atof(s) have values of type double; the arg of atof is a ptr to char */

  int x = 1, y = 2, z[10];
  int *ip; /* ip is a pointer to an int */


  ip = &x; /* ip now points to x */
  printf("ip contents: %d\n\n", *ip); /* returns 1 */
  



  y = *ip; /* y equals the contents of pointer ip */
  printf("y contents: %d\n\n", y); /* returns 1 */


  
  
  *ip = 0; /* the contents of ip are set to 0, so since the address of x is ip and ip=0, x is now 0 */
  printf("ip contents: %d\n", *ip); /* returns 0 */
  printf("x contents: %d\n\n", x); /* returns 0 */


  

  ip = &z[0]; /* ip now points to z[0] which is an empty array */
  printf("ip contents: %d\n\n\n", *ip); /* returns 0 */


  int i = 1;
  int *k;
  int *q;

  q = &i;
  printf("q contents: %d\n", *q);

  k = q;
  printf("q contents: %d\n", *q);
  printf("k contents: %d\n", *k);

  i = 5;
  printf("i is now %d\n", i);
  printf("q contents: %d\n", *q);
  printf("k contents: %d\n", *k);

  

  
  
  return 0;
}
