import java.util.Scanner;
public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter the radius ");
		double radius = entrada.nextDouble();
		double PI = Math.PI;
		double area = radius * radius * PI;
		System.out.println("The area is " + area);
		System.out.println();
		System.out.println("Enter the length ");
		double length = entrada.nextDouble();
		double volumen = area * length;
		System.out.println("The volumen is " + volumen);
		
	}

}
