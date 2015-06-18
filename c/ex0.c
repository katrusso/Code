/* midterm-ex00.c */

#include <stdio.h>
#include <sys/types.h>
#include <stdlib.h>

int main()
{
  int x = 150;
  printf( "PARENT: x is %d\n", x );

  printf( "PARENT: forking...\n" );
  pid_t pid = fork();
  printf( "PARENT: forked...\n" );

  if ( pid == 0 )
  {
    printf( "CHILD: happy birthday\n" );
    x *= 2;
    printf( "CHILD: %d\n", x );
  }
  else
  {
    wait( NULL );

    printf( "PARENT: child completed\n" );
    x *= 2;
    printf( "PARENT: %d\n", x );
  }

  return 0;
}

/*

OUTPUT:

PARENT: x is 150
PARENT: forking...
PARENT: forked...
PARENT: forked...
CHILD: happy birthday
CHILD: 300
PARENT: child completed
PARENT: 300

*/

