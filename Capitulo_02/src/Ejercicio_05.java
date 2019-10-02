import java.util.Scanner;
public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter the subtotal ");
		double subtotal = entrada.nextDouble();
		System.out.println("Enter the gratuity ");
		double gratuity = entrada.nextDouble();
		double total = subtotal + gratuity;
		System.out.println("The gratuity is " + gratuity + " and total is " + total);
	}

}
