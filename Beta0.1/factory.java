import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class factory<E>{
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
