/*
A pointer variable of structure can be created:

struct name {
    member1;
    member2;
    .
    .
};
-------- Inside function -------
struct name *ptr;

Here, the pointer variable of type struct name is created.

Structure's member through pointer can be used in two ways:

Referencing pointer to another address to access memory
Using dynamic memory allocation

*/

#include <stdio.h>
struct name{
   int a;
   float b;
};
int main(){
    struct name *ptr,p;
    ptr=&p;            /* Referencing pointer to memory address of p */
    printf("Enter integer: ");
    scanf("%d",&(*ptr).a);
    printf("Enter number: ");
    scanf("%f",&(*ptr).b);
    printf("Displaying: ");
    printf("%d%f",(*ptr).a,(*ptr).b);
    return 0;
}

/*
In this example, the pointer variable of type struct name is referenced to the address of p. Then, only the structure member through pointer can can accessed.

Structure pointer member can also be accessed using -> operator.

(*ptr).a is same as ptr->a
(*ptr).b is same as ptr->b

 */
