package cl.praxis.calculadoraDesafio2;

import java.util.Scanner;

public class Menu {

	private Scanner scan = new Scanner(System.in);
	private Operaciones operaciones = new Operaciones();

	public void operaciones() {
		boolean primeraOperacion = true;
		int result = 0;
		String entrada;
		int a = 0;
		int b;
		do {

			if (primeraOperacion == true) {
				System.out.println("Ingresa el primer digito: ");
				entrada = scan.nextLine();
				a = Utilidad.parsearEntero(entrada);

			}
			primeraOperacion = false;

			System.out.println("Seleccione operacion");
			System.out.println("1.- Sumar ");
			System.out.println("2.- Restar ");
			System.out.println("3.- Multiplicar ");
			System.out.println("4.- Dividir ");
			String operacion = scan.nextLine();

			System.out.println("Ingrese el siguiente Valor:");
			String entrada2 = scan.nextLine();
			b = Utilidad.parsearEntero(entrada2);

			switch (operacion) {
			case "1": {

				result = operaciones.sumar(a, b);
				a = result;
				break;
			}
			case "2": {

				result = operaciones.restar(a, b);
				a = result;
				break;
			}
			case "3": {

				result = operaciones.multiplicar(a, b);
				a = result;
				break;
			}
			case "4": {
				double adouble = (double) a;
				double bdouble = (double) b;
				result = (int) operaciones.dividir(adouble, bdouble);
				a = result;
				break;
			}

			default: {
				System.out.println("Dato no válido.");
				break;
			}

			}
			System.out.println("El resultado de la operacion es: " + result);
		} while (true);
	}

}
