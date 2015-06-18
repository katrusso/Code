/* midterm-ex05.c */

#include <stdio.h>
#include <unistd.h>

int main()
{
  int rc;
  int p[2];
  rc = pipe( p );
  printf( "%d %d %d\n", getpid(), p[0], p[1] );

  rc = fork();

  if ( rc == 0 )
  {
    rc = write( p[1], "ABCDEFGHIJKLMNOPQRSTUVWXYZ", 26 );
      	printf("in child %d\n", rc);

  }

  if ( rc > 0 )
  {
    	printf("in parent\n");

    char buffer[40];
    rc = read( p[0], buffer, 8 );
    buffer[rc] = '\0';
    printf( "%d %s\n", getpid(), buffer );
  	printf( "rc is: %d\n", rc);
  }

  printf( "BYE\n" );

  return 0;
}

/*
OUTPUT:

7139 3 4
7140 ABCDEFGH
BYE
7139 IJKLMNOP
BYE

*/