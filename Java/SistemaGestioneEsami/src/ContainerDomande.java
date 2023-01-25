
public class ContainerDomande {
	private ElementoContainer head, tail, current;
	private long numDomande;
	
	protected void append(ElementoContainer elem){
		if(tail == null){
			tail = elem;
			head = elem;
			current = elem;
		}else{
			tail.setNext(elem);
			elem.setPrev(tail);
			tail = elem;
			current = elem;
		}
		numDomande ++;
	}
	
	public void addDomanda(Domanda domanda){
		ElementoContainer elem = new ElementoContainer(domanda);
		append(elem);
	}

	public Domanda getCurrentDomanda(){
		Domanda d = null;
		if(current != null){
			d = current.getDomanda();
		}
		return d;
	}
	
	public Domanda getNextDomanda(){
		Domanda d = null;
		if((current != null) && current.getNext() != null){
			current = current.getNext();
			d = current.getDomanda();
		}
		return d;
	}
	
	public Domanda 
	
}
