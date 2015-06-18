/*
strcat() concatenates(joins) two strings. It takes two arguments, i.e, two strings and resultant string is stored in the first string specified in the argument.

strcat(first_string,second_string);
 */

#include <stdio.h>
#include <string.h>
int main(){
    char str1[]="This is ", str2[]="programiz.com";
    strcat(str1,str2);   //concatenates str1 and str2 and resultant string is stored in str1.
    puts(str1);    
    puts(str2); 
    return 0;
}

/*
This is programiz.com
programiz.com
 */
