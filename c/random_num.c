/* pseudo-random number generator using seed value */

#include <stdio.h>

unsigned long int next = 1;

int rand(void);
void srand(unsigned int seed);

int main(void)
{
  int random_num = rand();
  printf("random number is %d\n", random_num);
  return 0;
}

int rand(void) /* returns pseudo-random integer on 0..32767 */
{
  extern unsigned long int next;

  next = next * 1103515245 + 12345;
  return (unsigned int)(next/65536) % 32768;
}

void srand(unsigned int seed) /* set seed for rand() */
{
  extern unsigned long int next;
  next = seed;
}
