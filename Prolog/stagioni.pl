recog_seas([]).    % caso base, lista vuota
recog_seas([p,e,a,i|Rest]) :- recog_seas(Rest).  % metodo ricorsivo

initial(q0).   % stato iniziale
final(q0).     % stato finale

delta(q0, p, q1).    % transizione da q0 a q1 (p)
delta(q1, e, q2).    % transizione da q1 a q2 (e)
delta(q2, a, q3).    % transizione da q2 a q3 (a)
delta(q3, i, q0).    % transizione da q3 a q0 (i)
