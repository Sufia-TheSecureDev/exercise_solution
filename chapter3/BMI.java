import java.util.*;
public class BMI{
	public static void main(String[] args){
		double h , w , bmi;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your height in meter : ");
		h = scanner.nextDouble();
       System.out.println("enter your weight in kg : ");
		w = scanner.nextDouble();

		bmi = w / (h*h);

		System.out.println("your BMI is : "+ bmi);


	}
}