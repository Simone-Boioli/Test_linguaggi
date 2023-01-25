import java.awt.*;

public class CounterView extends Panel implements CounterInterfaceView {
	public CounterView(Counter model){
		super(new BorderLayout()); 
		contatore = model;       
		label = new Label("Valore contatore: null");
		Panel panelCenter = new Panel(new FlowLayout());   
		panelCenter.add(label);
		add(panelCenter, BorderLayout.CENTER); 

		controlloCounter = new CounterControl(contatore, this); //passo il modello e la vista (this)
		Panel panelSouth = new Panel(new FlowLayout());    
		Button bottoneDecr = new Button("Decrementa");  
		bottoneDecr.addActionListener(controlloCounter);
		panelSouth.add(bottoneDecr);  
		Button bottoneReset = new Button("Reset");
		bottoneReset.addActionListener(controlloCounter);
		panelSouth.add(bottoneReset);
		Button bottoneIncr = new Button("Incrementa");   
		bottoneIncr.addActionListener(controlloCounter);
		panelSouth.add(bottoneIncr);
		add(panelSouth, BorderLayout.SOUTH);
		updateView();
	}
	public void updateView(){      
		label.setText("Valore Contatore: " + contatore.getVal());
	}
	private Counter contatore;
	private Label label;
	private CounterControl controlloCounter;
}






















