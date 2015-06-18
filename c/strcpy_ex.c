#include <stdio.h>
#include <string.h>
int main(){
    char a[10],b[10];
    printf("Enter string: ");
    gets(a);
    strcpy(b,a);   //Content of string a is copied to string b.
    printf("Copied string: ");
    puts(b);
    return 0;
}
