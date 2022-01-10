import java.util.Scanner;
public class Stack{ 
	 public static void printArray(int[] array){
		for(int i=0; i<array.length ;i++){
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args){
		Scanner scr = new Scanner(System.in);
		int MAXSTK = 8 , TOP= 3 ;
		int[] array = new int[MAXSTK]; 
		array[0]=2;
		array[1]=5;
		array[2]=9;
		 printArray(array);
		int option = 1;
		while(option != 0){
			System.out.println("\nChoose any option :  ");
			System.out.println("1 for Push");
			System.out.println("2 for Pop");
			System.out.println("0 for exit");
			option = scr.nextInt();
			switch(option){
				case 1:
				  if(TOP == MAXSTK){
					  	System.out.println("OVERFLOW");
					  	  System.exit(MAXSTK);
					  }
					
					  	 System.out.print("enter item for push :  ");
				         int  ITEM = scr.nextInt();
					  	 TOP = TOP +1;
					     array[TOP-1] = ITEM;
				         System.out.println("top : "+TOP+" inserted item is : "+ ITEM);
					  
					 
				  break;
				case 2:
				   if(TOP == 0){
				  	System.out.println("UNDERFLOW");
				  	 System.exit(0);
				  }
				  ITEM = array[TOP-1]  ;
				  TOP = TOP -1;
				  System.out.println("top : "+TOP+" Deleted item is : "+ ITEM);
				  break;
				case 0:
				 break;
			}
		}
	}
}