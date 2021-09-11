/*Create a class called GeneralBank that acts as base class for all banks. 
 This class has getSavingsInterestRate and getFixedDepositInterestRate methods, 
 which returns the savings account interest rate and fixed deposit account interest rate that the specific bank gives. 
 Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class. The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and 
KotMBank - Savings 6% Fixed 9%.
Create a main method to test the above classes and their methods. Try one by one and observe your findings
a) ICICIBank i=new ICICIBank();
b) KotMBank k=new KotMBank();
c) GeneralBank g=new KotMBank();
d) GeneralBank g=new ICICIBank();
*/

package AbstractClasses;

abstract class GeneralBank{
	abstract double getSavingInterestRate();
	abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	double getSavingInterestRate() {
		return 4;
	}
	double getFixedDepositInterestRate() {
		return 8.5;
	}
}

class KotakMBank extends GeneralBank{
	double getSavingInterestRate() {
		return 6;
	}
	double getFixedDepositInterestRate() {
		return 9;
	}
}


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank i=new ICICIBank();
		System.out.println("============ICICIBank Details =========");
		System.out.println("SavingInterestRate : "+i.getSavingInterestRate()+"%");
		System.out.println("FixedInterestRate :"+i.getFixedDepositInterestRate()+"%");
		
		KotakMBank k=new KotakMBank();
		System.out.println("==========Kotak Mahindra Details =============");
		System.out.println("SavingInterestRate :"+k.getSavingInterestRate()+"%");
		System.out.println("FixedInterestRate :"+k.getFixedDepositInterestRate()+"%");
		
		System.out.println("----------------------------------------------------------------");
		
		GeneralBank g=new KotakMBank();
		System.out.println("GeneralBank for Kotak Mahindra  :"+"\nSavingRate :"+g.getSavingInterestRate()+"%"+"\nFixedRate :"+g.getFixedDepositInterestRate()+"%");
		
		
		GeneralBank g1=new ICICIBank();
		System.out.println("GeneralBank  for ICICIBank :"+"\nSavingRate :"+g1.getSavingInterestRate()+"%"+"\nFixedRate :"+g1.getFixedDepositInterestRate()+"%");
		
	}

}
