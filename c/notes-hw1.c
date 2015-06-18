#include <stdio.h>
#include <stdlib.h> /*getenv() */
#include <string.h> /* strcpy(), strcmp() */
#include <sys/stat.h> /* lstat() */
#include <unistd.h> /* getcwd(), execlp() */
#include <fcntl.h> /* lstat() flags */
#include <stdbool.h> /* bool fns */

#define MAXLINE 100

int main(void)
{
  int len;
  char *cwd = get_current_working_dir();

  char *mypath = get_env_var();
  char *temp_tokenized_mypath = malloc ( MAXLINE * sizeof(char) );
  temp_tokenized_mypath = tokenize_value(mypath, "#");
  int mp_argcount = sizeof(temp_tokenized_mypath)/sizeof(temp_tokenized_mypath[0]);
  char *tokenized_mypath = realloc(temp_tokenized_mypath, mp_argcount * sizeof(char) );
  free (temp_tokenized_mypath);

/*
  while(1)
    {
      char *userInput = malloc ( MAXLINE * sizeof(char) );
      if ( userInput == NULL)
	printf("Error allocating memory\n"); 								   
      
      printf( "%s $ ", cwd);
      fgets(userInput,MAXLINE,stdin);
      len = strlen(userInput);
      userInput[len-1] = '\0'; /*overwrites \n with \0 */
      char *temp_tokenized_userInput = malloc ( MAXLINE * sizeof(char) );
      temp_tokenized_userInput = tokenize_value(userInput, " \t \n" );
      int input_argcount = sizeof(temp_tokenized_userInput)/sizeof(temp_tokenized_userInput[0]);
      char *tokenized_userInput = realloc(temp_tokenized_userInput, input_argcount * sizeof(char) );
      free (temp_tokenized_userInput);
      free (userInput);

      // bool check_permissions(char *cwd, char *mypath, int mypath_argcount, char *input)

      //process_cmd();
    }

  return 0;
}
