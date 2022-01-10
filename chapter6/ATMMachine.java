import java.util.Scanner;
public class ATMMachine{
	public static void main(String[] args){
		long amount , balance;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your account no: ");
		String no = scanner.nextLine();
		System.out.println("enter your pass: ");
		String pass = scanner.nextLine();

		Account account = new Account();
		if(no.equals(account.getNo()) && pass.equals(account.getPass())){
			System.out.println("Login successful.");
			System.out.println("\nMain Menu\n1: Check Balance \n2: withdraw\n3: Deposite\n4: Exit");
			int option = scanner.nextInt();
			
			switch(option){
				case 1 :
				 System.out.println("your current balance is : "+account.getBalance() );
				 break;
				case 2 :
				    System.out.print("enter  amount for withdraw :  ");
				    amount = scanner.nextInt();
				      account.setAmount(amount);
				     balance = account.getBalance();
				    account.withdraw();
				     System.out.println("\nafter withdraw your current balance  is :  "+balance+" - "+amount+" = "+account.getBalance()); 
				     break;
				    case 3 :
				       System.out.print("enter  amount for deposit :  ");
					    amount = scanner.nextInt();
					     account.setAmount(amount);
					     balance = account.getBalance();
					     account.deposite();
					     System.out.println("\nafter deposite your current balance  is :  "+balance+" + "+amount+" = "+account.getBalance()); 
					     break;
					 case 4 :
					 break;    
			}

		}else{
			System.out.println("invalid no and pass !");
		}

	}
}
class Account{
	private String no = "12462486";
	private String pass = "j3GbAeY6" ;
	private long amount;
	private long balance = 1000;
	public void setAmount(long amount){
		this.amount = amount;
	}
     public long getAmount(){
     	return amount;
     }
	public String getNo(){
		return no;
	}
	public String getPass(){
		return pass;
	}
	public  long getBalance(){
		return balance;
	}
	public final void  deposite(){
		balance += amount;
	}
	public final void withdraw(){
		balance -= amount;
	}
}