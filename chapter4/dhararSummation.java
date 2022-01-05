public class dhararSummation{
	public static void main(String[] args){
	 int n = 1000;
	 float sum = 1;
	 for (int i=1 ; i<=n ;i++){
         sum += (float) 1 / i;
	 }
	 System.out.println(sum);
	}
	
}