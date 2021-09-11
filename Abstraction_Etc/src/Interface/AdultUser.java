package Interface;

public class AdultUser implements LibraryUser{
	private int age;
	private String BookType;
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String BookType) {
		this.BookType = BookType;
	}
	public void registerAcoount() {
		if(age>12) {
			System.out.println("You have successfully registered as Adult  Account......");
		}
		else {
			System.out.println("Sorry ..! Age must be greatetr than 12 to register as Adult account....");
		}
	}
	public void requestBook() {
		if(BookType.equals("Fiction")) 
		{
			System.out.println("Book issued successfully....please return within 7 days ....");
		}
		else {
			System.out.println("OOPS .....You are allowed to take only adult fiction book.....");
		}
	}
}
