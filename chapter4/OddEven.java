import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int digit = scanner.nextInt();
		if(digit<0){
			System.out.println("Negative digit.");
		}else{
			if(digit % 2 == 0){
	           System.out.println("even");
		}else{
			 	System.out.println("odd");
		}
		}
		
	}
}