import java.util.Scanner;
 


public class Maint{
	
	public static void main(String[] args) {
		
		char[][] chairs = new char[10][10];
		boolean bandera = false;
		Scanner teclado = new  Scanner(System.in);
		int fila=0, asiento=0;
		String verMapa, contReserva;
 		
		for (int f=0; f<10;f++) {
			for (int c=0; c<10;c++) {
				chairs [f][c] = 'L';
			}  
		}
		
		System.out.println("------------SISTEMA DE RESERVA-----------");
 		
		
		while(bandera!=true){
			//TODO ESTO SE IMPRIMIRA EN LA CONSOLA CADA VEZ QUE RESERVEMOS UN ASIETNO
			System.out.println("Desea ver los asientos disponibles? s = Si, cualquier tecla = NO");
			verMapa = teclado.next();
			
			if(verMapa.equalsIgnoreCase("S")){
				dibujarMapa(chairs);
			}
			
			boolean bien = false;
			while(bien!=true) {
				System.out.println("Ingrese fila y asiento a reservar");
				System.out.print("Fila (entre 0 y 9): ");
				fila = teclado.nextInt();
				System.out.print("Asiento (entre 0 y 9): ");
				asiento = teclado.nextInt();
				
				if(fila<=9 && fila>=0) {
					if(asiento<=9 && asiento>=0) {
						bien = true;
					}else {
						System.out.println("el número de asiento no es válido");
					}
				}else {
					System.out.println("el número de fila no es válido");
				}
				
			}
			
			if(chairs[fila][asiento] =='L') {
				chairs[fila][asiento] = 'X';
				System.out.println("El asiento ha sido reservado con éxito");
			}else {
				System.out.println("El asiento está reservado, por favor ingrese otro asiento");
			}
			
			
			System.out.println("Desea reservar otro asiento, presione S = Si y cualquier tecla para NO");
			contReserva = teclado.next();
			
			if(contReserva.equalsIgnoreCase("S")){
				bandera = true;
 			}	
   		}
 	}
	
	static void dibujarMapa(char chairs[][]){
		System.out.println(" ");
		for (int f=0; f<10;f++) {
				System.out.print(f + " ");
			for (int c=0; c<10;c++) {	
				System.out.print("[ "+ chairs[f][c] + " ]" );
			}
			System.out.println(" ");
		}
		
	}
	
}
