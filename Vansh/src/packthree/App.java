package packthree;
import packone.One;
//import packtwo.One; error
//import packtwo.Three; error
import packtwo.Two; 

class Child extends One{
	
	void show(){
		protShow();
	}
}


public class App {

	public static void main(String[] args) {
		
//		One o = new One();
//		Two t = new Two();
//				
//		o.pubShow();
//		t.pubShow();
		
		Child ch = new Child();
		ch.pubShow();
		ch.show();
		
	}

}
