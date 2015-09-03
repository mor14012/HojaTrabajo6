/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carne: 14012
Yosemite Noe. Carne: 14413
03/09/2015
Hoja de Trabajo 6
*/

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conjuntos {
	
	Factory fc = new Factory();
	private Set<String> conjunto;
	private List<String> ordenado;
	private Set<String> cnjt;
	private int mayor;
	private String cMayor;
	private String subconjunto;
	
	
	public Conjuntos(String string){
		conjunto = fc.getSet(string);
		cnjt = fc.getSet(string);
		ordenado = new ArrayList<String>();
		mayor = 0;
		cMayor = "";
		subconjunto = "";
		
	}
	
	public void agregarElemento(String e){
		conjunto.add(e);
		ordenado.add(e);
	}
	
	
	public Set<String> getConjunto(){
		return conjunto;
	}
	
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
		
		if (c.size() > j.size() && c.size() > w.size()){
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
	
	public List<String> getOrdenado (){
		Collections.sort(ordenado);
		return ordenado;
	}
}
