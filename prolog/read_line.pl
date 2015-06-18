  %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%  read_line
%%%  Similar to read_sent in Pereira and Shieber, Prolog and
%%%        Natural Language Analysis, CSLI, 1987.
%%%
%%%  Examples:
%%%           % read_line(L).
%%%           The sky was blue, after the rain.
%%%           L = [the,sky,was,blue,',',after,the,rain,'.']
%%%           % read_line(L).
%%%           Which way to the beach?
%%%           L = [which,way,to,the, beach,'?']
%%%

read_line(Words) :- get0(C),
                    read_rest(C,Words).
          
/* A period or question mark ends the input. */
read_rest(46,['.']) :- !.
read_rest(63,['?']) :- !.

/* Spaces and newlines between words are ignored. */
read_rest(C,Words) :- ( C=32 ; C=10 ) , !,
                     get0(C1),
                     read_rest(C1,Words).

/* Commas between words are absorbed. */
read_rest(44,[','|Words]) :- !,
                             get0(C1),
                             read_rest(C1,Words).

/* Otherwise get all of the next word. */
read_rest(C,[Word|Words]) :- lower_case(C,LC),
                             read_word(LC,Chars,Next),
                             name(Word,Chars),
                             read_rest(Next,Words).

/* Space, comma, newline, period or question mark separate words. */
read_word(C,[],C) :- ( C=32 ; C=44 ; C=10 ;
                         C=46 ; C=63 ) , !.

/* Otherwise, get characters, convert alpha to lower case. */
read_word(C,[LC|Chars],Last) :- lower_case(C,LC),
                                get0(Next),
                                read_word(Next,Chars,Last).

/* Convert to lower case if necessary. */
lower_case(C,C) :- ( C <  65 ; C > 90 ) , !.
lower_case(C,LC) :- LC is C + 32.


/* for reference ... 
newline(10).
comma(44).
space(32).
period(46).
question_mark(63).
*/


  
% This allows you to load the program read_line.pl
% This will allow you to use the read_line predicate in your source file.
% :- [read_line].

% This is the top-level term for this toy grammar.
% Note that the the period is also captured when using read_line so
% we account for this by capturing the period in the grammar using the 
% end term.

% This rule also introduces the capture of input through our X variable.
word(X) --> noun(X),end.

% This is an example of adding extra info to the captured input.
% In this case, we are adding the extra info that this word is a noun by
% using the n predicate.

noun(n(toy)) --> [toy].
noun(n(car)) --> [car].
end --> ['.'].

% Below are two ways of parsing input using your grammar.
 parse(Tree,Sentence) :- word(Tree,Sentence,[]).

% This second rule relies on a built in predicate 'phrase' to work with 
% the DCG syntax. The phrase predicate hides the details of how DCG is 
% converted into Prolog.
 parse(Tree,Sentence) :- phrase(word(Tree),Sentence).

% This predicate reads the user input, parses it to see if it is accepted 
% by the grammar, and outputs the resulting parse tree if the grammar is
% accepted.

check_input :- read_line(Sent),parse(Tree,Sent),write(Tree).
