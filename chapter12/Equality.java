import java.util.Scanner;
public class Equality{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		 int len = str.length();
		  String fst = str.substring(0,1);
		  String lst = str.substring(len-2,len-1);
		  if(fst.equals(lst)){
		  	System.out.println(true);
		  }else{
		  	System.out.println(false);
		  }
	}
}