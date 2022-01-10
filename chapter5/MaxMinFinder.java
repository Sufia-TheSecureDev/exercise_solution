import java.util.Scanner;
public class MaxMinFinder{ 
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];  
		 for(int i= 0; i<n; i++){
			 array[i] = scanner.nextInt();			 
		}
		int max = max(array);
		int min = min(array);
		System.out.println("Max : "+ max);
		System.out.println("Min : "+ min); 
	}
	public static int max(int[] array){
		int max = 0;
		 for(int i= 0; i<array.length; i++){ 
		 	if(i == 0 ){
		 		max = array[i]; 
		 	}else{
		 		 if(array[i] > max){
		 		max = array[i]; 		 
		 	   }else{
		 		continue;
		 	   }
		 	}
		 	
		}
		return max;
	}
	public static int min(int[] array){
		int min= 0  ;
		 for(int i= 0; i<array.length; i++){ 
		 	if(i == 0 ){
		 		min = array[i]; 
		 	}else{
		 	   if(array[i] < min){
		 		min = array[i]; 		 
		 	   }else{
		 		continue;
		 	
		 	   }
		    }
		 }
		return min;
	}
}