public class PatternSeven{
	public static void main(String[]  args){
		int n = 7;
		for(int i= 0; i<n ; i++){
			if (i== 0 || i == n-1){
				 for (int j=0; j<n ; j++){ 
				    System.out.print("# ");
			    }
			}else{
				for (int j=n; j> i ; j--){ 
				     if(j == i+1){
				     	System.out.print("# ");
				     }else{
				     	System.out.print("  ");
				     }
			    }
			}
			System.out.println();
		}
	}
}