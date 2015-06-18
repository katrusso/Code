/* 
pass string to function; 
string c is passed from main() function to user-defined function Display(). In function declaration, ch[] is the formal argument. 
*/
#include <stdio.h>
void Display(char ch[]);
int main(){
    char c[50];
    printf("Enter string: ");
    gets(c);             
    Display(c);     // Passing string c to function.    
    return 0;
}
void Display(char ch[]){
    printf("String Output: ");
    puts(ch);
}
