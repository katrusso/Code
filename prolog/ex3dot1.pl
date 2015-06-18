child(shirley, carol).
child(carol, trudy).
child(trudy, bess).
child(bess, anne).
child(anne,bridget).
child(bridget,caroline).
child(caroline,donna).
child(donna,emily).
child(maddy, sue).
child(sue, kathy).
child(kathy, tannen).
  
descend(X,Y) :- child(X,Y).
descend(X,Y) :- descend(X,Z),
                 descend(Z,Y).

