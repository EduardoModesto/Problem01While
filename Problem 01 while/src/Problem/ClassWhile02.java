package Problem;

import java.util.Locale;
import java.util.Scanner;

public class ClassWhile02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		int sum = 0;
		int cont = 0;

		while (age >= 0) {
			sum = sum + age;
			cont = cont + 1;
			age = sc.nextInt();
		}
		
		if (cont > 0) {
			double average = (double) sum / cont;
			System.out.printf("%.2f%n", average);
		} 
		else {
			System.out.println("impossible to calculate");
		}

		sc.close();
	}

}
