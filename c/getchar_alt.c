#include <stdio.h>
/* Hit Ctrl + D to signal end-of-file condition */


int main(void)
{
    int c;
    while (1) {
        c = getchar();            // Get one character from the input
        if (c == EOF) { break; }  // Exit the loop if we receive EOF ("end of file")
        putchar(c);               // Put the character to the output
    }
    return 0;
}
