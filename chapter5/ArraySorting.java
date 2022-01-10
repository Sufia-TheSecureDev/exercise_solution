public class ArraySorting{ 
	public static void main(String[] args){
		int[] array = {32,51,27,85,66,23,13,57};
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
		 
		for(int i=0; i<n ;i++){
			System.out.print(array[i]+" ");
		}
	}
}