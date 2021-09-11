package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {
	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();
		
		Saxophone sp=new Saxophone();
		sp.play();
		
		
		Playable p1=new Veena();
		p1.play();
		Playable p2=new Saxophone();
		p2.play();
		
	}
}
