:-[read_line].

  sentence(sentence(NP,VP))  -->  np(NP),vp(VP), end.
  np(np(DET,NOM))  -->  det(DET),nom(NOM). 
  vp(vp(V))  -->  v(V).
  nom(nom(N))  -->  n(N).
  end --> ['.'].

  det(det(a))      -->  [a].     
  det(det(the))  -->  [the].
  det(det(every))      -->  [every]. 
    
  n(n(train))  -->  [train]. 
  n(n(bike))      -->  [bike]. 
  n(n(person))      -->  [person]. 
    
  v(v(flew))  -->  [flew].
  v(v(left))  -->  [left].
  v(v(arrived))  -->  [arrived].
  v(v(stayed))  -->  [stayed].

    
loop:- read_line(X), sentence(Y, X, []), write(Y), nl, loop.  
