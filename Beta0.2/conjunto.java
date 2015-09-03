import java.util.Set;

public class conjunto{
	public Set javawebphone(Set java, Set web, Set phone){
		java.retainAll(phone);
		web.retainAll(java);
		return web;
	}

	public Set javanoweb(Set java, Set web){
		java.removeAll(web);
		return java;
	}

	public Set webphonenojava(Set java, Set web, Set phone){
		web.retainAll(phone);
		web.removeAll(java);
		return web;
	}

	public Set webophonenojava(Set java, Set web, Set phone){
		web.addAll(phone);
		web.removeAll(java);
		return web;
	}

	public boolean javasubweb(Set java, Set web){
		if(web.containsAll(java))
			return true;
		else
			return false;
	}
}