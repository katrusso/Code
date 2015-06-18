/* 
Structure is the collection of variables of different types under a single name for better handling. 

Ex: You want to store the information about person about his/her name, citizenship number and salary. 
You can create these information separately but, better approach will be collection of these information under single name because all these information are related to person.
 
Syntax:

struct structure_name 
{
    data_type member1;
    data_type member2;
    .
    .
    data_type memeber;
};

struct person
{
    char name[50];
    int cit_no;
    float salary;
};

When a structure is defined, it creates a user-defined type but, no storage is allocated. 
For the above structure of person, variable can be declared as:

struct person
{
    char name[50];
    int cit_no;
    float salary;
};

Inside main function:
struct person p1, p2, p[20];


Another way of creating sturcture variable is:

struct person
{
    char name[50];
    int cit_no;
    float salary;
}p1 ,p2 ,p[20];

In both cases, 2 variables p1, p2 and array p having 20 elements of type struct person are created.

There are two types of operators used for accessing members of a structure.

Member operator(.)
Structure pointer operator(->) (will be discussed in structure and pointers chapter)
Any member of a structure can be accessed as: structure_variable_name.member_name

Suppose, we want to access salary for variable p2. Then, it can be accessed as:
p2.salary


Write a C program to add two distances entered by user. Measurement of distance should be in inch and feet.(Note: 12 inches = 1 foot):
*/


#include <stdio.h>
struct Distance{
    int feet;
    float inch;
}d1,d2,sum;
int main(){
    printf("1st distance\n");
    printf("Enter feet: ");
    scanf("%d",&d1.feet);  /* input of feet for structure variable d1 */
    printf("Enter inch: ");
    scanf("%f",&d1.inch);  /* input of inch for structure variable d1 */
    printf("2nd distance\n");
    printf("Enter feet: ");
    scanf("%d",&d2.feet);  /* input of feet for structure variable d2 */
    printf("Enter inch: ");
    scanf("%f",&d2.inch);  /* input of inch for structure variable d2 */
    sum.feet=d1.feet+d2.feet;
    sum.inch=d1.inch+d2.inch;
    if (sum.inch>12){  //If inch is greater than 12, changing it to feet.
        ++sum.feet;
        sum.inch=sum.inch-12;
    }
    printf("Sum of distances=%d\'-%.1f\"",sum.feet,sum.inch); 
/* printing sum of distance d1 and d2 */
    return 0;
}

/*
1st distance
Enter feet: 12
Enter inch: 7.9
2nd distance
Enter feet: 2
Enter inch: 9.8
Sum of distances= 15'-5.7"
 */

