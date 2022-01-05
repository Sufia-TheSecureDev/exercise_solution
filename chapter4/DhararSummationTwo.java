 public class DhararSummationTwo{
	public static void main(String[] args){
	 int n = 1000;
	 float sum = 0;
	 for (int i=3 ; i<=n ;i++){
	 	if(i % 2 == 1){
         sum += (float) 1 / i;
	 	}
	 }
	 sum = 4 * (1 - sum);
	 System.out.println(sum);
	}
	
}