puzzle([A, B, C, D, E, F, G, H, I]):-
permutation([1, 2, 3, 4, 5, 6, 7, 8, 9], [A, B, C, D, E, F, G, H, I]), A+B+D=:=17,
A+C+F=:=17,
D+E+F=:=17,
D+G+I=:=17,
F+H+I=:=17.
