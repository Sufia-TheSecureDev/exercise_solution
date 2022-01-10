import java.util.Scanner;
public class Fibonacchi{ 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];  
		 for(int i= 0; i<array.length; i++){
		 	 array[i] = fib(i);
		}
		 
		for(int i=0; i<array.length ;i++){
			System.out.print(array[i]+" ");
		}
	}
	public static int fib(int n){
		if(n<=1){
			return n;
		}
		else{
			return fib(n-1) + fib(n-2);
		}
	}
}