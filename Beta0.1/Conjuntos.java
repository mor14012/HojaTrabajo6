/**
 * 
 */
import java.util.Set;

/**
 * 
 * @author Yosemite
 *
 */
public class Conjuntos {
	
	factory fc = new factory();
	private Set<String> conjunto;
	private Set<String> cnjt;
	private int cMayor;
	
	public Conjuntos(String string){
		conjunto = fc.getSet(string);
		cnjt = fc.getSet(string);
		cMayor = 0;
		
	}
	
	public void agregarElemento(String e){
		conjunto.add(e);
	}
	
	public Set<String> getConjunto(){
		return conjunto;
	}
	
	public Set<String> interseccionTres(Set<String> j, Set<String> w, Set<String> c){
		//j = java, w = web, c = celulares
		cnjt.clear();
		cnjt.addAll(j);
		cnjt.retainAll(w);
		cnjt.retainAll(c);
		
		return cnjt;
	}
	
	public Set<String> JavaNoWeb(Set<String> j, Set<String> w){
		cnjt.clear();
		cnjt.addAll(j);
		cnjt.removeAll(w);
		return cnjt;
	}
	
	public Set<String> interseccionWebCel(Set<String> j, Set<String> w, Set<String> c){
		cnjt.clear();
		cnjt.addAll(w);
		cnjt.retainAll(c);
		cnjt.removeAll(j);
		return cnjt;
	}
	
	public Set<String> unionWebCel(Set<String> w, Set<String> c){
		cnjt.clear();
		cnjt.addAll(w);
		cnjt.addAll(c);
		return cnjt;
	}

	public boolean subconjunto(Set<String> j, Set<String> w){
		cnjt.clear();
		cnjt.addAll(w);
		if(cnjt.contains(j)){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public int conjuntoMayor(Set<String> j, Set<String> w, Set<String> c){
		if (j.size() > w.size()){
			cMayor = 0;  // 0 = java mayor
		}else {
			cMayor = 1; // 1 = web mayor
		}
		
		if (cMayor > c.size()){
			cMayor = cMayor;
		}else
			cMayor = 2; // 2 = cel es mayor
		
		
		return cnjt;
	}
}
