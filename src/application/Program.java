package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		double[] vector = new double[3];
		
		for (int i=0; i<3; i++) {
			System.out.print(i+1 + " - Number: ");
			vector[i] = input.nextDouble();
		}
		
		double sum = 0.0;
		for (int i=0; i<3; i++) {
			sum += vector[i];
		}

		double avg = sum / 3;
		System.out.println("Average: " + String.format("%.2f", avg));

		input.close();
	}

}
