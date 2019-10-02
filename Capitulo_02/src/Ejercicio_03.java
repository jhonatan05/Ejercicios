import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre a value for feet ");
		double feet = entrada.nextDouble();
		System.out.println("Entre a value for meters ");
		double meters = entrada.nextDouble();
		double meters2 = meters * feet;
		System.out.println(feet +(" feet is ") + meters2 + (" meters") );
	}

}
