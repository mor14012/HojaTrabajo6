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
	private int Mayor;
	private String cMayor;
	private String subconjunto;
	
	public Conjuntos(String string){
		conjunto = fc.getSet(string);
		cnjt = fc.getSet(string);
		Mayor = 0;
		cMayor = "";
		subconjunto = "";
		
	}
	
	public void agregarElemento(String e){
		conjunto.add(e);
	}
	
	
	public Set<String> getConjunto(){
		return conjunto;
	}
	
	//j = java, w = web, c = celulares
	
	public Set<String> interseccionTres(Set<String> j, Set<String> w, Set<String> c){
		
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
	
	public Set<String> unionWebCel(Set<String> j, Set<String> w, Set<String> c){
		cnjt.clear();
		cnjt.addAll(w);
		cnjt.addAll(c);
		cnjt.removeAll(j);
		return cnjt;
	}

	public String subconjunto(Set<String> j, Set<String> w){
		cnjt.clear();
		cnjt.addAll(w);
		if(cnjt.contains(j)){
			return subconjunto = "Si es un subconjunto";
		}else{
			return subconjunto = "No es un subconjunto";
		}
	}
	
	
	
	public String conjuntoMayor(Set<String> j, Set<String> w, Set<String> c){
		if (j.size() > w.size()){
			Mayor = 0;  // 0 = java mayor
			cMayor = "El conjunto mayor es el de desarrolladores Java";
		}else {
			Mayor = 1; // 1 = web mayor
			cMayor = "El conjunto mayor es el de desarrolladores Web";
		}
		
		if (c.size() > Mayor){
			Mayor = 2; // 2 = cel es mayor
			cMayor = "El conjunto mayor es el de desarrolladores Celulares";
		}
		
		return cMayor;
	}
}
