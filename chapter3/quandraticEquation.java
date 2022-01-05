public class quandraticEquation{
	public static void main(String[] args){
		int a = 2 , b = 6 , c = 4  ;
        int r1 = (int) (-b + Math.sqrt(Math.pow(b , 2)- (4*a*c))) / (2*a);
        int r2 =(int) (-b - Math.sqrt(Math.pow(b , 2)- (4*a*c))) / (2*a);
        System.out.println("root R1 : "+ r1);
        System.out.println("root R2 : "+ r2);
	}
}