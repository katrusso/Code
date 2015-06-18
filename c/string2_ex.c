/* read line of text from user manually

This process to take string is tedious. There are predefined functions gets() and puts in C language to read and display string respectively.
*/
#include <stdio.h>
int main(){
    char name[30],ch;
    int i=0;
    printf("Enter name: ");
    while(ch!='\n')    // terminates if user hit enter
    {
        ch=getchar();
        name[i]=ch;
        i++;
    }
    name[i]='\0';       // inserting null character at end
    printf("Name: %s",name);
    return 0;
}
