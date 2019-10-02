import java.util.Scanner;
public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter a number in pounds");
		double pounds = entrada.nextDouble();
		System.out.println("Enter a number in kilograms ");
		double kilograms = entrada.nextDouble();
		double kilograms2 = kilograms * pounds;
		System.out.println(pounds + ("pounds is ") + kilograms2 + (" kilograms"));
	}

}
