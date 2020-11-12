package it.unibo.oop.lab.nesting2;
import java.util.*;

public class OneListAcceptable<T> implements Acceptable<T> {
	private List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}
	public Acceptor<T> acceptor() {
		Iterator<T> iterator = this.list.iterator();
		return new Acceptor<T>(){

			public void accept(T newElement) throws ElementNotAcceptedException {
				try{
					if (newElement.equals(iterator.next())) {
						return;
					}
				} catch(Exception e) {
					System.out.println("Non ci sono altri elementi da aggiungere");
		
				}
				throw new Acceptor.ElementNotAcceptedException(newElement);
			}

			public void end() throws EndNotAcceptedException {
			try {	
				if (!iterator.hasNext()) {
					return;
				} 
			}catch(Exception e) {
					System.out.println("2" + e.getMessage());
				}
			throw new Acceptor.EndNotAcceptedException();
			}
			
			
		};
	}

}
