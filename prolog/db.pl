:-[read_line].
  :-dynamic sentence/2.

  getPredicate(sentence(N, V))  --> the, noun(N), name(X), verb(V), end.
  getPredicate(neg_sentence(N, PV))  -->  the, noun(N), name(X), did, my_not, pres_verb(PV), end.

  runQuery1(sentence(N, PV)) --> did, a, noun(N), pres_verb(PV), question_mark. 
  runQuery2(sentence(N, PV)) --> did, every, noun(N), pres_verb(PV), question_mark. 

  name(X) --> [X].

  did --> ['did'].
  a --> ['a'].
  every --> ['every'].
  question_mark--> ['?'].
  the --> ['the'].
  my_not -->['not'].
  end --> ['.'].
  
  noun(train)  -->  ['train']. 
  noun(bike)      -->  ['bike']. 
  noun(person)      -->  ['person']. 
    
  verb(flew)  -->  ['flew'].
  verb(left)  -->  ['left'].
  verb(arrived)  -->  ['arrived'].
  verb(stayed)  -->  ['stayed'].

  pres_verb(left) --> ['leave'].
  pres_verb(flew) --> ['fly'].
  pres_verb(arrived) --> ['arrive'].
  pres_verb(stayed) --> ['stay'].

 /* loop:- read_line(X), getPredicate(Y, X, []), assert(Y), loop. */

loop:- read_line(X), processInput(X), loop.

processInput(X):-getPredicate(Y, X, []), !, assert(Y). 

processInput(X):- runQuery1(Y, X, []), checkQuery1(Y).
checkQuery1(Y):- Y, !, write('yes'), nl.
checkQuery1(_):- write('no'), nl.

processInput(X):- runQuery2(Y, X, []), checkQuery2(Y).
checkQuery2(Y):- Y, !, write('no'), nl.
checkQuery2(_):- write('yes'), nl.
