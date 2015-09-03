/**
 * 
 */
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * @author Yosemite
 *
 */
public class Conjuntos {
	
	Factory fc = new Factory();
	private Set<String> conjunto;
	//private Set<String> conjuntoOrdenado;
	private Set<String> cnjt;
	SortedSet<String> orden = new TreeSet<String>();
	private int mayor;
	private String cMayor;
	private String subconjunto;
	
	
	public Conjuntos(String string){
		conjunto = fc.getSet(string);
		cnjt = fc.getSet(string);
		//conjuntoOrdenado = fc.getSet(string);
		mayor = 0;
		cMayor = "";
		subconjunto = "";
		
	}
	
	public void agregarElemento(String e){
		conjunto.add(e);
		//conjuntoOrdenado.add(e);
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
		if(cnjt.containsAll(j)){
			return subconjunto = "Si es un subconjunto";
		}else{
			return subconjunto = "No es un subconjunto";
		}
	}
	
	
	
	public String conjuntoMayor(Set<String> j, Set<String> w, Set<String> c){
		if (j.size() > w.size()){
			mayor = 0;  // 0 = java mayor
			cMayor = "El conjunto mayor es el de desarrolladores Java";
		}else {
			mayor = 1; // 1 = web mayor
			cMayor = "El conjunto mayor es el de desarrolladores Web";
		}
		
		if (c.size() > mayor){
			mayor = 2; // 2 = cel es mayor
			cMayor = "El conjunto mayor es el de desarrolladores Celulares";
		}else {
		
			if (j.size() == w.size() || j.size() == c.size() || w.size() == c.size()){
			cMayor = "Hay dos conjuntos con la misma cantidad de desarrolladores";
		
			}
		}
		return cMayor;
	}
	
	public int Mayor(){
		return mayor;
	}
	
	//public Set<String> getOrdenado (){
		//return conjuntoOrdenado;
	//}
}
