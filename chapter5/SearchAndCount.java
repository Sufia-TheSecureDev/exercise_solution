import java.util.Scanner;
public class SearchAndCount{ 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int digit = scanner.nextInt();
		int count=0;
		int[] array = {1,9,2,4,9,6,7,5,8,6,9,5,6,9};
		 for(int i= 0; i<array.length; i++){
			 if(array[i] == digit){
			 	count++;
			 }
		}
		System.out.println(count);
		 

	}
}