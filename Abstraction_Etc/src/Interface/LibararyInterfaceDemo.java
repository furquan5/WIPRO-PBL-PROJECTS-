package Interface;

public class LibararyInterfaceDemo {

	public static void main(String[] args) {
		KidUser ku=new KidUser();
		System.out.println("===========Display from Kids===========");
		ku.setAge(11);
		ku.setBookType("Kids");
		ku.registerAcoount();
		ku.requestBook();
		
		ku.setAge(55);
		ku.setBookType("Kids");
		ku.registerAcoount();
		ku.requestBook();
		
		ku.setAge(1);
		ku.setBookType("abcdef");
		ku.registerAcoount();
		ku.requestBook();
		
		
		
		AdultUser au=new AdultUser();
		System.out.println("==========Display from AdultUser=============");
		au.setAge(25);
		au.setBookType("Fiction");
		au.registerAcoount();
		au.requestBook();
		
		au.setAge(12);
		au.setBookType("Fiction");
		au.registerAcoount();
		au.requestBook();
		
		au.setAge(25);
		au.setBookType("kids");
		au.registerAcoount();
		au.requestBook();
		
		
		

	}

}
