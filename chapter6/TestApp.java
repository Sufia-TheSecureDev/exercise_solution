public class TestApp{
	public static void main(String[] args){
		Author author = new Author("ANM Bazlur Rahman","bazlur@gmail.com","M");
		Book book = new Book(" java Programming",author,500,1000);
		System.out.println("name of the book : "+book.getName());
		System.out.println("name of the Author : "+book.getAuthor().getName());
		System.out.println("price of the book : "+book.getPrice());
		System.out.println("available in stock : "+book.getInStock());
	}
}
class Author{
	private String name;
	private String email;
	private String gender;

	public Author(String name , String email, String gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return gender;
	}

}
class Book{
	private String name;
	private Author author;
	private int price;
	private int inStock;

	public Book(String name, Author author , int price , int inStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.inStock = inStock;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAuthor(Author author){
		this.author = author;
	}
	public Author getAuthor(){
		return author;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setInStock(int inStock){
		this.inStock = inStock;
	}
	public int getInStock(){
		return inStock;
	}
}