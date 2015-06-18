/*
Here, typedef keyword is used in creating a type comp(which is of type as struct complex). Then, two structure variables c1 and c2 are created by this comp type.


typedef struct complex{
  int imag;
  float real;
}comp;

Inside main:
comp c1,c2;


Structures can be nested within other structures in C programming.

struct complex
{
 int imag_value;
 float real_value;
};
struct number{
   struct complex c1;
   int real;
}n1,n2;

Suppose you want to access imag_value for n1 structure variable then, structure member n1.c1.imag_value is used.
 */
