/* midterm-ex1.c */

#include <stdio.h>
#include <unistd.h>

int main()
{
  int rc;
  printf( "ONE\n" );
  rc = fork();
  printf( "rc = %d\n", rc);
  printf( "TWO\n" );
    printf( "rc = %d\n", rc);

  if ( rc == 0 ) { printf( "THREE\n" ); }
  printf( "rc = %d\n", rc);

  if ( rc > 0 ) { printf( "FOUR\n" ); }
  return 0;
}


/*
OUTPUT:

ONE
TWO
FOUR
TWO
THREE


ONE
rc = 7092
TWO
rc = 7092
rc = 7092
FOUR
rc = 0
TWO
rc = 0
THREE
rc = 0

*/