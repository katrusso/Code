/* ex7.c, old midterm question */

#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main()
{
	int x = 4;
	printf( "PID %d: %d\n", getpid(), x);
	
	close( x / 2 );
	pid_t pid = fork();
	printf( "PID %d: fork() is done\n", getpid() );
	fprintf( stderr, "ERROR: yikes\n" );
	
	if ( pid>0 )
	{
		printf( "PID %d: hurry up!\n", getpid() );
		x -= 4;
		int y = waitpid( pid, NULL, 0);
		printf( "PID PARENT %d%d\n", getpid(), x, y );
	}
	else
	{
		printf( "PID %d: wait for me!\n", getpid() );
		x += 3;
		printf( "PID CHILD %d: %d\n", getpid(), x );
	}
	
	fprintf( stderr, "all done\n" );
	
	return 0;
	
	}
	
	/*	
OUTPUT:

PID 7198: 4
PID 7198: fork() is done
PID 7198: hurry up!
PID 7199: fork() is done
PID 7199: wait for me!
PID 7199: 7
PID 7198: 07199

*/
	