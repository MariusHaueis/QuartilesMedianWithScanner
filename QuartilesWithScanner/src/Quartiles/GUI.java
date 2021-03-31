package Quartiles;
/**
 * This class represents the input and output management of this project.
 * @author Marius Haueis
 * @version 30.03.2021
 */
import java.util.ArrayList;
import java.util.Scanner;


public class GUI {
	public Scanner sc;
	public QuartilesCalculator qc;
	double t =0;
	
	public GUI() {
		qc = new QuartilesCalculator();
		sc = new Scanner(System.in);
	}
	public void action() {
		t = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>((int) t);
		ArrayList<Integer> result = new ArrayList<Integer>(3);
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			numbers.add(k);
		}		
		result = (ArrayList<Integer>) qc.quartiles(numbers);
		System.out.println("The left quartile: " + result.get(0));
		System.out.println("The middle quartile: " + result.get(2));
		System.out.println("The right quartile: " + result.get(1));
}
}

