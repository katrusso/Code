/* pipes btw processes: pipe_ex1.c */

#include <stdlib.h>
#include <stdio.h>

void runpipe();

int
main(int argc, char **argv)
{
	int pid, status;
	int fd[2];

	pipe(fd);

	switch (pid = fork()) {

	case 0: /* child */
		runpipe(fd);
		exit(0);

	default: /* parent */
		while ((pid = wait(&status)) != -1)
			fprintf(stderr, "process %d exits with %d\n", pid, WEXITSTATUS(status));
		break;

	case -1:
		perror("fork");
		exit(1);
	}
	exit(0);
}

char *cmd1[] = { "/bin/ls", "-al", "/", 0 };
char *cmd2[] = { "/usr/bin/tr", "a-z", "A-Z", 0 };

void
runpipe(int pfd[])
{
	int pid;

	switch (pid = fork()) {

	case 0: /* child */
		dup2(pfd[0], 0);
		close(pfd[1]);	/* the child does not need this end of the pipe */
		execvp(cmd2[0], cmd2);
		perror(cmd2[0]);

	default: /* parent */
		dup2(pfd[1], 1);
		close(pfd[0]);	/* the parent does not need this end of the pipe */
		execvp(cmd1[0], cmd1);
		perror(cmd1[0]);

	case -1:
		perror("fork");
		exit(1);
	}
}


/*

OUTPUT:

TOTAL 17149
DRWXR-XR-X   38 ROOT           WHEEL     1360 SEP 29 19:48 .
DRWXR-XR-X   38 ROOT           WHEEL     1360 SEP 29 19:48 ..
-RW-RW-R--    1 ROOT           ADMIN    15364 OCT  2 22:28 .DS_STORE
D--X--X--X    8 ROOT           WHEEL      272 SEP 29 20:17 .DOCUMENTREVISIONS-V100
DRWX------    5 ROOT           ADMIN      170 SEP  4 13:20 .SPOTLIGHT-V100
D-WX-WX-WT    2 ROOT           WHEEL       68 SEP  4 13:20 .TRASHES
SRWXRWXRWX    1 ROOT           ADMIN        0 JUL 23  2012 .DBFSEVENTSD
----------    1 ROOT           ADMIN        0 AUG 24  2013 .FILE
DRWX------  397 ROOT           WHEEL    13498 OCT  7 11:04 .FSEVENTSD
-RW-------    1 ROOT           WHEEL   196608 SEP 20 11:08 .HOTFILES.BTREE
DRWXR-XR-X@   2 ROOT           WHEEL       68 AUG 24  2013 .VOL
DRWXRWXR-X+ 100 ROOT           ADMIN     3400 OCT  2 22:44 APPLICATIONS
DRWXRWXR-X   16 ROOT           ADMIN      544 SEP  4 14:13 DEVELOPER
DRWXRWXR-X@  17 ROOT           ADMIN      578 APR 21  2011 DEVELOPER-OLD
DRWXR-XR-X+  69 ROOT           WHEEL     2346 SEP 19 18:10 LIBRARY
DRWXR-XR-X@   2 ROOT           WHEEL       68 AUG 24  2013 NETWORK
-RW-R--R--    1 KATHLEENRUSSO  ADMIN   147456 FEB 19  2014 PENCOMMSDK.LOG
DRWXR-XR-X+   4 ROOT           WHEEL      136 SEP  4 12:55 SYSTEM
LRWXR-XR-X    1 ROOT           ADMIN       60 SEP 26  2009 USER GUIDES AND INFORMATION -> /LIBRARY/DOCUMENTATION/USER GUIDES AND INFORMATION.LOCALIZED
DRWXR-XR-X    6 ROOT           ADMIN      204 SEP 29 20:20 USERS
DRWXRWXRWT@   4 ROOT           ADMIN      136 OCT  6 13:50 VOLUMES
DRWXR-XR-X@  39 ROOT           WHEEL     1326 SEP  4 12:57 BIN
DRWXRWXR-T@   2 ROOT           ADMIN       68 AUG 24  2013 CORES
DR-XR-XR-X    3 ROOT           WHEEL     4381 SEP 29 19:50 DEV
LRWXR-XR-X@   1 ROOT           WHEEL       11 SEP  4 12:43 ETC -> PRIVATE/ETC
DR-XR-XR-X    2 ROOT           WHEEL        1 SEP 29 20:03 HOME
-RW-R--R--@   1 KATHLEENRUSSO  ADMIN        0 JUL 17  2013 LIBPEERCONNECTION.LOG
-RWXR-XR-X@   1 ROOT           WHEEL  8394200 AUG 17 22:50 MACH_KERNEL
DR-XR-XR-X    2 ROOT           WHEEL        1 SEP 29 20:03 NET
DRWXR-XR-X@   4 KATHLEENRUSSO  WHEEL      136 SEP  4 14:18 OPT
DRWXR-XR-X@   6 ROOT           WHEEL      204 SEP  4 13:03 PRIVATE
DRWXR-XR-X@  62 ROOT           WHEEL     2108 SEP 29 19:48 SBIN
LRWXR-XR-X@   1 ROOT           WHEEL       11 SEP  4 12:45 TMP -> PRIVATE/TMP
DRWXR-XR-X    3 ROOT           ADMIN      102 SEP 16  2011 UGS
DRWXR-XR-X@  16 ROOT           WHEEL      544 SEP  4 14:22 USR
LRWXR-XR-X@   1 ROOT           WHEEL       11 SEP  4 12:45 VAR -> PRIVATE/VAR
process 7182 exits with 0

*/