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
		int option;
		factory Factory;

		System.out.println("Bienvenido");
		/*-----------
		/  FACTORY  /
		------------*/
		while(true){
			try{
				System.out.println("\nSeleccione la implementacion de Set que desea utilizar:");
				for(int i=0; i<implementation.length; i++)
					System.out.println("   "+i+". "+implementation[i]);
				Scanner input = new Scanner(System.in);
				option = input.nextInt();
				Factory = new factory();
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
				System.out.println("Tipo de desarrollador\nEscriba 'y' si pertenece al grupo, sino escriba 'n':");
				for(int i=0; i<dev.length; i++){
					System.out.print(dev[i]+": ");
					String grupo = input.nextLine();
					while(true){
						if(grupo.equals("y")){
							if(i==0)
								javadev.add(nombre);
							if(i==1)
								webdev.add(nombre);
							if(i==2)
								phonedev.add(nombre);
							break;
						}
						else{
							if(!grupo.equals("n"))
								System.out.println("Ingrese una opcion valida");
						}
					}
					
				}
			}
			catch(Exception e){

			}
		}


		/*-----------
		/    SET     /
		------------*/
		Set java = Factory.getSet(implementation[option]);
		java.addAll(javadev);
		Set web = Factory.getSet(implementation[option]);
		web.addAll(webdev);
		Set phone = Factory.getSet(implementation[option]);
		phone.addAll(phonedev);
		System.out.println("Java "+javadev.size());
		System.out.println("Web "+webdev.size());
		System.out.println("Phone "+phonedev.size());

		conjunto Conjunto = new conjunto();
		Set resultado = Factory.getSet(implementation[option]);

		System.out.println("\nResultados");

		System.out.println("\nDesarrolladores con experiencia en Java, web y celulares.");
		resultado = Conjunto.javawebphone(javadev, webdev, phonedev);
		Object [] array1 = resultado.toArray();
		for(int i=0; i<array1.length; i++){
			System.out.println(array1[i]);
		}
		
		System.out.println("\nDesarrolladores con experiencia en Java pero que no tengan experiencia en web.");
		resultado = Conjunto.javanoweb(javadev, webdev);
		Object [] array2 = resultado.toArray();
		for(int i=0; i<array2.length; i++){
			System.out.println(array2[i]);
		}

		System.out.println("\nDesarrolladores con experiencia en web y celulares, pero que no tengan experiencia en java");
		resultado = Conjunto.webphonenojava(javadev, webdev, phonedev);
		Object [] array3 = web.toArray();
		for(int i=0; i<array3.length; i++){
			System.out.println(array3[i]);
		}

		System.out.println("\nDesarrolladores con experiencia en web o celulares, pero que no tengan experiencia en celulares");
		resultado = Conjunto.webophonenojava(javadev, webdev, phonedev);
		Object [] array4 = resultado.toArray();
		for(int i=0; i<array4.length; i++){
			System.out.println(array4[i]);
		}



		System.out.println("\nEl conjunto de desarrolladores java es un subconjunto de desarrolladores web.");
		boolean decision = Conjunto.javasubweb(javadev, webdev);
		if(decision)
			System.out.println("SI");
		else
			System.out.println("NO");			

		System.out.println("\nEl conjunto con la cantidad mas grande de desarrolladores y sus nombres");
		Set bigger = Factory.getSet(implementation[option]);
		web.addAll(webdev);
		java.addAll(javadev);
		phone.addAll(phonedev);	
		if(web.size()>java.size() && web.size()>phone.size())
			bigger.addAll(web);
		if(java.size()>web.size() && java.size()>phone.size())
			bigger.addAll(java);
		if(phone.size()>java.size() && phone.size()>web.size())
			bigger.addAll(phone);
		if(!bigger.isEmpty()){
			Object [] array5 = bigger.toArray();
			for(int i=0; i<array5.length; i++){
				System.out.println(array5[i]);
			}			
		}
		else
			System.out.println("No existe un conjunto de desarrolladores mayor que los otros dos");


		System.out.println("\nLista de desarrolladores del grupo mas grande (en orden ascendente)");
		if(!bigger.isEmpty()){
			//Imprimir en orden ascendente
		}
		else
			System.out.println("No existe un conjunto de desarrolladores mayor que los otros dos");


	}
}
/*
References:

https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html

*/