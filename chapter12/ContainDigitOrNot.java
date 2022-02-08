public class ContainDigitOrNot{
	public static void main(String[] args){
		String str = "amfr";
		String digit = "0123456789";
		boolean yon = false; 
			for (int i= 0; i<str.length(); i++){
			for(int j= 0; j<digit.length(); j++){
				if(str.charAt(i) == digit.charAt(j) ){
					 yon = true;
					break;
				}
			}
			if (yon == true){
				System.out.println("yes");
				break;
			}
		}
		if(yon == false){
				System.out.println("no");
		}
	}
}