import java.util.*;
public class IncomeTaxCalculator{
	public double calculateTax(double income){
		 double tax = 0.0d;
		if (income<=250000){
			tax = 0.0;
		}
		else if(income > 250000 && income<=400000){
			tax = (10 * income) / 100;
		}
		else if (income>400000 && income <= 500000){
			tax = (15 * income) / 100;
		}
		else if(income>500000 &&  income<=600000){
			tax = (20 * income) / 100;
		}
		else if(income>600000 && income<= 3000000){
		   tax = (25 * income) / 100;
		}
		else if(income> 3000000){
			tax = (30 * income) / 100;
		}
		return tax;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your income : ");
		double income = scanner.nextDouble();
		IncomeTaxCalculator calculator = new IncomeTaxCalculator();
		double tax = calculator.calculateTax(income);
		System.out.println("your total income is : "+income);
		System.out.println("the amount of tax  is : "+tax);
	}
}