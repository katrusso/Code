/* ex8.c old midterm question */

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main()
{
	int rc;
	int p[2];
	char buffer[30];
	close( 1+1 );
	rc = pipe( p );
	printf( "%d-%d-%d\n", getpid(), p[0], p[1] );
	rc = fork();
	if ( rc==0)
	{
		rc = write( p[1], "wintersummerwintersummer", 24);
		printf( "%d-%d\n", getpid(), rc);
		rc = fork();
	}
	if ( rc>0 )
	{
		int n = p[1] + p[0] * p[0];
		rc = read( p[0], buffer, n );
		buffer[rc] = '\0';
		printf( "%d-%s\n", getpid(), buffer );
	}
	else
	{
		wait( NULL );
		printf( "%d-%d\n", getpid(), rc);
	}
	
	return 0;
}

/* 
OUTPUT:

7208-2-3
7209-24
7208-winters
7209-ummerwi
7210-0

*/