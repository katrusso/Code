/* static var ex */
#include <stdio.h>
void Check();
int main(){
   Check();
   Check();
   Check();
}
void Check(){
    static int c=0;
    printf("%d\t",c);
    c+=5;
}

/*
The value of static variable persists until the end of the program

output:
0      5     10
*/
