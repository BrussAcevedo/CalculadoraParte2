package cl.praxis.calculadoraDesafio2;

public class Utilidad {
	
	public static int parsearEntero(String entrada) {
		boolean validar = validarEntero(entrada);
		int entradaInt;
		if (validar = true) {
			entradaInt = Integer.parseInt(entrada);
			
		}else {
			System.out.println("ERROR: el valor ingresado no es un numero entero.");
			entradaInt = 0;
		}
		return entradaInt;
	}

	public static boolean validarEntero(String entrada) {
		
		if (entrada.matches("\\d+")) {
			return true;
		}else {
			return false;
		}
	}
	

}
