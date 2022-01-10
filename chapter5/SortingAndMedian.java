public class SortingAndMedian{ 
	public static void printArray(int[] array){
		for(int i=0; i<array.length ;i++){
			System.out.print(array[i]+" ");
		}
	}
	public static void bubbleSort(int[] array){
	int temp ;
		int n = array.length;
		 for(int i= 0; i< n-1; i++){
		 	for(int j = 0; j< n-i-1 ; j++){
		 		if(array[j] > array[j+1]){
 					temp = array[j];
 					array[j] = array[j+1];
 					array[j+1] = temp; 
			 	}else{
			 		continue;
			 	}
		 	}
		}
	}
	public static void meanAndMedian(int[] array){
		double sum = 0 , median = 0;
		int n = array.length;
			for(int i=0; i<n ;i++){
				sum += array[i] ;
		}
		double mean = sum / n ;
		System.out.println("\nMean :  "+ mean);

		if(n % 2 != 0){
			median = array[n/2];
		}else{
			median  = (array[(n-1)/2]+array[n/2]) / 2.0 ;
		}
		System.out.println("Median :  "+ median);
	}
	public static void main(String[] args){
		int[] array = {32,51,27,85,66,23,13,57};
		
		System.out.print("Actual Array :  ");
		printArray(array);
		 System.out.print("\nSorted Array :  ");
		 bubbleSort(array);
		 printArray(array);
	     meanAndMedian(array);

	}
}