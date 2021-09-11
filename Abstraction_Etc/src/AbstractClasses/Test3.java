package AbstractClasses;
import java.util.*;
abstract class Instrument{
	abstract String play();
}

class Piano extends Instrument{
	public String play() {
		return "Piano is playing tan tan tan tan ";
	}
}
class Flute extends Instrument{
	public String play() {
		return "Fluter is playing toot toot toot toot";
	}
}
class Guitar extends Instrument{
	public String play() {
		return "Guitar is playing tin tin tin tin";
	}
}


public class Test3 {
	public static void main(String[] args) {
		Instrument [] instruments =new Instrument[10];
		Random random=new Random();
		for(int i=0;i<10;i++) {
			int randomNum=random.nextInt((3-1)+1)+1;
			if(randomNum==1) {
				instruments[i]=new Piano();
			}
			if(randomNum==2) {
				instruments[i]=new Flute();
			}
			if(randomNum==3) {
				instruments[i]=new Guitar();
			}
			System.out.println(instruments[i].play());
			
		}
		System.out.println("========================================");
		for(int i=0;i<10;i++) {
			if(instruments[i] instanceof Piano)
				System.out.print("Instrument " + i + " is of type Piano, \n");
    		if(instruments[i] instanceof Flute)
        		System.out.print("Instrument " + i + " is of type Flute, \n");
    		if(instruments[i] instanceof Guitar)
        		System.out.print("Instrument "+ i + " is of type Guitar, \n");
    		instruments[i].play();
		}
		
	}

}
