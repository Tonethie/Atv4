package Conta;

import java.util.ArrayList;
import java.util.Iterator;

public class ContaCorrente implements Iterable<OP> {
		private ArrayList<OP> obj;
	
		public ContaCorrente() {
			obj = new ArrayList<OP>();
		}
		public void addOP (OP op) {
			obj.add(op);
		}
		public Iterator<OP> iterator() {
			return obj.iterator();
		}
}
