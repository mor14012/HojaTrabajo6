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
	
	public Conjuntos(String string){
		conjunto = fc.getSet(string);
		cnjt = fc.getSet(string);
		
	}
	
	public void agregarElemento(String e){
		conjunto.add(e);
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
		//cnjt.retain
		return cnjt;
	}
	
	public Set<String> unionWebCel(){
		
		return cnjt;
	}

	public Set<String> subconjunto(){
		
		return cnjt;
	}
	
	public Set<String> conjuntoMayor(){
		
		return cnjt;
	}
}
