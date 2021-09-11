package test;

public class MFoundation {

	public static void main(String[] args) {
		Foundation f=new Foundation();
		//f.var1=10; //Private variable can't be accessed outside the class
		f.var2=20;
		f.var3=30;
		f.var4=40;
		
		System.out.println("=======Display the Variables ======");
		//System.out.println(f.var1);
		System.out.println(f.var2);
		System.out.println(f.var3);
		System.out.println(f.var4);

	}

}
