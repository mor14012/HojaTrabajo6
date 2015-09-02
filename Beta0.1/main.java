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
		Set javadev, webdev, phonedev;
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


		
	}
}
/*
References:

https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html
https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html

*/