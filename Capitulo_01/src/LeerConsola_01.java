import java.util.Scanner;
public class LeerConsola_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el numero de a ");
		double a = entrada.nextDouble();
		
		System.out.println("ingrese el numero de b ");
		double b = entrada.nextDouble();
		
		System.out.println("ingrese el numero de c ");
		double c = entrada.nextDouble();
		
		System.out.println("ingrese el numero de d ");
		double d = entrada.nextDouble();
		
		System.out.println("ingrese el numero de e ");
		double e = entrada.nextDouble();
		
		System.out.println("ingrese el numero de f ");
		double f = entrada.nextDouble();
		
		System.out.println("el valo de x es " + ((e*d-b*f)/(a*d-b*c)));
		
		System.out.println("el valor de y es " + ((a*f-e*c)/(a*d-b*c)));

	}

}
