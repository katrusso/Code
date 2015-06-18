/* realloc ex

If the previously allocated memory is insufficient or more than sufficient. 
Then, you can change memory size previously allocated using realloc().

ptr=realloc(ptr,newsize);
 */

#include <stdio.h>
#include <stdlib.h>
int main(){
    int *ptr,i,n1,n2;
    printf("Enter size of array: ");
    scanf("%d",&n1);
    ptr=(int*)malloc(n1*sizeof(int));
    printf("Address of previously allocated memory: \n");
    for(i=0;i<n1;++i)
         printf("%u\n",ptr+i);
    printf("\nEnter new size of array: ");
    scanf("%d",&n2);
    ptr=realloc(ptr,n2);
    for(i=0;i<n2;++i)
         printf("%u\n",ptr+i);
    return 0;
}

/*
Enter size of array: 5
Address of previously allocated memory: 
3788505088
3788505092
3788505096
3788505100
3788505104

Enter new size of array: 2
3788505088
3788505092

 */
