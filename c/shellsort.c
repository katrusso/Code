/* Shell sort (for sorting an array of integers);
   far-apart elements are compared rather than adjacent ones 

sort v[0] ... v[n - 1] into increasing order 

 - an in-place comparison sort. 
 - can be seen as either a generalization of sorting by exchange (bubble sort) or sorting by insertion (insertion sort).
 - The method starts by sorting pairs of elements far apart from each other, then progressively reducing the gap between elements to be compared. Starting with far apart elements can move some out-of-place elements into position faster than a simple nearest neighbor exchange. 

 - the runtime of Shellsort is heavily dependent on the gap sequence it uses.


Worst case performance	O(n^2)
Best case performance	O(n log^2 n)
*/

#include <stdio.h>
#define ARRAY_SZ 6

void shellsort(int v[], int n); /* IS n SUPPOSED TO BE THE ARRAY SIZE? I GUESSED IT WAS */

int main(void)
{
  int v[ARRAY_SZ] = {5, 3, 12, 1, 4, 2};
  shellsort(v, ARRAY_SZ);
  
  return 0;
}

/* 
   outer loop: ctrls gap btwn compared elements, shrinking it from n/2 by a factor of 2 each pass until it becomes zero. 
   middle loop: steps along the elements
   innermost loop: compares each pair of elements that is separated by gap and reverses any that are out of order

   since gap is eventually reduced to one, all elements are eventually ordered correctly.
*/

void shellsort(int v[], int n)
{
  int gap, i, j, temp;

  for ( gap = n/2; gap > 0; gap /= 2 ) 
    for ( i = gap; i < n; i++ )
      for ( j = i - gap; j >= 0 && v[j] > v[j + gap]; j -= gap)
	{
	  temp = v[j];
	  v[j] = v[j+gap];
	  v[j+gap] = temp;
	}

  
  printf("Sorted int array is: ");
    for (int i = 0; i < ARRAY_SZ; i++)
    {
        printf(" %d ", v[i]);
    }
    printf("\n");
}
