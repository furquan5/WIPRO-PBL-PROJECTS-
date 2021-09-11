package Interface;

public class KidUser implements LibraryUser{
	private int age;
	private String BookType;
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String BookType) {
		this.BookType = BookType;
	}
	public void registerAcoount() {
		if(age<12) {
			System.out.println("You have successfully registered under kids Account......");
		}
		else {
			System.out.println("Sorry ..! Age must be less than 12 to register as kid account....");
		}
	}
	public void requestBook() {
		if(BookType.equals("kids")) 
		{
			System.out.println("Book issued successfully....please return within 10 days ....");
		}
		else {
			System.out.println("OOPS .....You are allowed to take only kids book.....");
		}
	}

}
