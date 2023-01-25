import java.awt.*;
import java.awt.event.*;
class ContECL extends Frame
{
Label l1=new Label("Etichetta1");
Label l2=new Label("Etichetta2");
Label l3=new Label("Etichetta3");
Label l4=new Label("Etichetta4");
Label l5=new Label("Etichetta5");
Panel p=new Panel(new GridLayout(2,1));
CardLayout CL=new CardLayout(14,14);
Panel p1=new Panel(CL);
Panel NPB=new Panel(new FlowLayout());
public ContECL()
{
p.add(NPB);
p.add(p1);
Button N=new Button("Prossimo");
Button P=new Button("Precedente");
NPB.add(P);
NPB.add(N);
P.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
CL.previous(p1);
}
}
);
N.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
CL.next(p1);
}
}
);
p1.add("uno",l1);
p1.add("due",l2);
p1.add("tre",l3);
p1.add("quattro",l4);
p1.add("cinque",l5);
add(p);
pack();
show();
}
public static void main(String [] arg)
{
new ContECL();
}
}