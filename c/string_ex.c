/* array of character are called strings. A string is terminated by null character /0. 

strings are of char type.
char s[5];

Strings can also be declared using pointer.
char *p;

string can be initialized in different number of ways.
char c[]="abcd";
     
char c[5]="abcd";
     
char c[]={'a','b','c','d','\0'};
    
char c[5]={'a','b','c','d','\0'};



String can also be initialized using pointers
char *c="abcd";

Reading words from user:
char c[20];
scanf("%s",c);

*/

#include <stdio.h>
int main(){
    char name[20];
    printf("Enter name: ");
    scanf("%s",name);
    printf("Your name is %s.",name);
    return 0;
}

/*
Enter name: Dennis Ritchie
Your name is Dennis.

program will ignore Ritchie because, scanf() function takes only string before the white space.
*/
