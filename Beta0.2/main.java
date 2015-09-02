/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Diego Morales. Carné: 14012
Yosemite. Carné: 14
27/08/2015
Hoja de Trabajo 6
*/


import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class main{
	public static void main(String[] args) {
		String [] implementation = {"HashSet", "TreeSet", "LinkedHashSet"};
		String [] dev = {"Desarrollador Java", "Desarrollador Web", "Desarrollador Celulares"};
		Set javadev, webdev, phonedev;
		ArrayList<String> user = new ArrayList<String>();
		System.out.println("Bienvenido");
		/*-----------
		/  FACTORY  /
		------------*/
		while(true){
			try{
				System.out.println("\nSeleccione la implementación de Set que desea utilizar:");
				for(int i=0; i<implementation.length; i++)
					System.out.println("   "+i+". "+implementation[i]);
				Scanner input = new Scanner(System.in);
				int option = input.nextInt();
				factory Factory = new factory();
				Set set = Factory.getSet(implementation[option]);
				if(set!=null){
					javadev = Factory.getSet(implementation[option]);
					webdev = Factory.getSet(implementation[option]);
					phonedev = Factory.getSet(implementation[option]);
					break;
				}
			}
			catch(Exception e){
				System.out.println("Error 1: Ingreso incorrecto. Intentelo de nuevo.");
			}
		}
		/*-----------
		/    DATA    /
		------------*/
		System.out.println("\nIngreso de datos:\nEscriba 'done' para finalizar el ingreso.");
		while(true){
			try{
				System.out.println("\nIngreso de usuario:\n");
				Scanner input = new Scanner(System.in);
				System.out.print("Nombre: ");
				String nombre = input.nextLine();
				if(nombre.equals("done"))
					break;
				user.add(nombre);
				System.out.println("Tipo de desarrollador\nSeleccione y/n si pertenece al grupo:");
				for(int i=0; i<dev.length; i++){
					System.out.print(dev[i]+": ");
					String grupo = input.nextLine();
					if(grupo.equals("y")){
						if(i==0)
							javadev.add(nombre);
						if(i==1)
							webdev.add(nombre);
						if(i==2)
							phonedev.add(nombre);
					}
				}
			}
			catch(Exception e){

			}
		}


		/*-----------
		/    SET     /
		------------*/
		System.out.println("\nResultados");
		System.out.println("\nDesarrolladores con experiencia en Java, web y celulares.");
		Set java = javadev;
		Set web = webdev;
		java.retainAll(phonedev);
		web.retainAll(java);
		Object [] webarray = web.toArray();
		for(int i=0; i<web.size(); i++){
			System.out.println(webarray[i]);
		}
		System.out.println("\nDesarrolladores con experiencia en Java pero que no tengan experiencia en web.");
		for(int i=0; i<user.size(); i++){
			if( javadev.contains(user.get(i)) && !webdev.contains(user.get(i)) )
				System.out.println( user.get(i) );
		}
		System.out.println("\nDesarrolladores con experiencia en web y celulares, pero que no tengan experiencia en java");
		for(int i=0; i<user.size(); i++){
			if( !javadev.contains(user.get(i)) && webdev.contains(user.get(i)) && phonedev.contains(user.get(i)))
				System.out.println( user.get(i) );
		}
		System.out.println("\nDesarrolladores con experiencia en web o celulares, pero que no tengan experiencia en celulares");
		for(int i=0; i<user.size(); i++){
			if( !javadev.contains(user.get(i)) && ( webdev.contains(user.get(i)) || phonedev.contains(user.get(i)) ))
				System.out.println( user.get(i) );
		}
		System.out.println("\nEl conjunto de desarrolladores java es un subconjunto de desarrolladores web.");
		if(webdev.containsAll(javadev))
			System.out.println("SI");
		else
			System.out.println("NO");


	}
}
/*
References:

https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html

*/