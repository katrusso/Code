#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
typedef enum {
    C_EURO,
    C_STERLING,
    C_DOLLARS
} currency_et;
 
currency_et GetEnumFromString ( const char *s ) {
    static struct {
        const char *s;
        currency_et e;
    } map[] = {
        { "C_EURO", C_EURO },
        { "C_STERLING", C_STERLING },
        { "C_DOLLARS", C_DOLLARS },
    };
    int i;
    for ( i = 0 ; i < sizeof(map)/sizeof(map[0]); i++ ) {
        if ( strcmp(s,map[i].s) == 0 ) {
            return map[i].e;
        }
    }
}
 
int main ( ) {
    currency_et var;
    var = GetEnumFromString( "C_STERLING" );
    printf( "Result=%d\n", (int)var );
    switch(var){
    case 0:
      printf("Here!\n");
      break;
    default:
      printf("default\n");
      break;
    }
    return EXIT_SUCCESS;
}
