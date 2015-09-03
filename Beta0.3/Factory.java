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
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Factory<E>{
	public Set<E> getSet(String string){
		if(string.equals("HashSet"))
			return new HashSet<E>();
		if(string.equals("TreeSet"))
			return new TreeSet<E>();
		if(string.equals("LinkedHashSet"))
			return new LinkedHashSet<E>();
		return null;
		
	}
}
