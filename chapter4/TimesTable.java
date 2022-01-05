import java.util.Scanner;
public class TimesTable{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int digit = scanner.nextInt();

		for(int i=1 ; i<= 10; i++){
			System.out.println(digit + " * "+ i + " = "+ digit*i);
		}
	 
	}
}