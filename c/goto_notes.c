/* goto notes: loc 2253 in kindle c programming book 

goto: used to abandon processing in some deeply nested structure, such as breaking out of 2+ loops at once

   for ( ... )
      for ( ... )
         ...
          if (disaster)
             goto error;
        }
    ...

    error:
        clean up the mess


 - A label has the same form as a variable name, and is followed by a colon.
 - It can be attached to any stmt in the same fn as the goto. 

 - The scope of a label is the entire fn

 - code that relies on goto stmts is generally harder to maintain than code w/o gotos.
 */
