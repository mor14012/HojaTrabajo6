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

public class main{
	public static void main(String[] args) {
		String [] implementation = {"HashSet", "TreeSet", "LinkedHashSet"};
		String [] dev = {"Desarrollador Java", "Desarrollador Web", "Desarrollador Celulares"};
		
		Conjuntos javadev;
		Conjuntos webdev;
		Conjuntos phonedev;
		Conjuntos conjunto;
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
				int option = input.nextInt();
				Factory factory = new Factory();
				Set set = factory.getSet(implementation[option]);
				if(set!=null){
					javadev = new Conjuntos(implementation[option]);
					webdev = new Conjuntos(implementation[option]);
					phonedev = new Conjuntos(implementation[option]);
					conjunto = new Conjuntos(implementation[option]);
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
				System.out.println("Tipo de desarrollador\nSeleccione y/n si pertenece al grupo:");
				for(int i=0; i<dev.length; i++){
					while(true){
						System.out.print(dev[i]+": ");
						String grupo = input.nextLine();
						if(grupo.equals("y")){
							if(i==0)
								javadev.agregarElemento(nombre);
							if(i==1)
								webdev.agregarElemento(nombre);
							if(i==2)
								phonedev.agregarElemento(nombre);
							break;
						}
						else{
							if(!grupo.equals("n"))
								System.out.println("Ingrese una opcion valida");
							else
								break;
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
		
		
        Set<String> jDev=javadev.getConjunto();
        Set<String> wDev=webdev.getConjunto();
        Set<String> pDev=phonedev.getConjunto();
        
        System.out.println("1. Desarrolladores con experiencia en Java, web y celulares.");
        System.out.println(conjunto.interseccionTres(jDev, wDev, pDev));
        System.out.println("2. Desarrolladores con experiencia en Java pero que no tengan experiencia en web.");
        System.out.println(conjunto.JavaNoWeb(jDev, wDev));
        System.out.println("3. Desarrolladores con experiencia en Web y Celulares, pero que no tengan experiencia en java.");
        System.out.println(conjunto.interseccionWebCel(jDev, wDev, pDev));
        System.out.println("4. Desarrolladores con experiencia en Web o Celulares, pero que no tengan experiencia en java.");
        System.out.println(conjunto.unionWebCel(jDev, wDev, pDev));
        System.out.println("5. Indicar SI o NO el conjunto de desarrolladores Java es un subconjunto de Desarrolladores Web.");
        System.out.println("" + conjunto.subconjunto(jDev, wDev));
        System.out.println("6. El conjunto (Java, Web o Celulares) que tenga la cantidad mas grande de desarrolladores, y los nombres de esos desarrolladores.");
        System.out.println("" + conjunto.conjuntoMayor(jDev, wDev, pDev));
        if(conjunto.Mayor() == 0) { 
        	System.out.println("" + jDev); 
        	System.out.println("7. Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en orden ascendente.");
            //System.out.println(javadev.getOrdenado());	
        }
        if(conjunto.Mayor() == 1) {
        	System.out.println("" + wDev); 
        	System.out.println("7. Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en orden ascendente.");
            //System.out.println(webdev.getOrdenado());
        }
        if(conjunto.Mayor() == 2) { 
        	System.out.println("" + pDev); 
        	System.out.println("7. Del conjunto que tenga la mayor cantidad de desarrolladores, desplegar la lista de los nombres de sus integrantes en orden ascendente.");
            //System.out.println(phonedev.getOrdenado());
        }
        
        
	}
}
/*
References:

https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html

*/