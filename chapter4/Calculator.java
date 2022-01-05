import java.util.Scanner;
public class Calculator{
	public int add(int a , int b){
		return a+b;
	}
	public int subtract(int a , int b){
		return a - b;
	}
	public int multiplication(int a , int b){
		 return a * b;
	}
	public int division(int a, int b){
		return a / b;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();

		int choice ,result;
		do{
			System.out.println("please choose :");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("0 for quit");

			choice = scanner.nextInt();
			System.out.println("enter a number :");
			int a = scanner.nextInt();
			System.out.println("enter another number :");
			int b = scanner.nextInt();

			switch(choice){
				case 1:
				 result = calculator.add(a , b);
				System.out.println("your result : "+result);
				break;

				case 2:
				 result = calculator.subtract(a , b);
				System.out.println("your result : "+result);
				break;

				case 3:
				 result = calculator.multiplication(a , b);
				System.out.println("your result : "+result);
				break;

				case 4:
				 result = calculator.division(a , b);
				System.out.println("your result : "+result);
				break;

				case 0:
				break; 

			}

		}while(choice!= 0);
	}
}