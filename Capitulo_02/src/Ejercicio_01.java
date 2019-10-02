import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Enter a degree in Celcius: ");
		double celcius = entrada.nextDouble();
		double formulaFarenheit = (9.0 / 5) * celcius + 32;
		System.out.println(celcius + " Celcius is " + formulaFarenheit + " Fahrengeit");
		//Math.PI
	}

}
