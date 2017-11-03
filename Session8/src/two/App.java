package two;

import one.One;
//import one.Two; error

public class App {

	public static void main(String[] args) {
		
		One o = new One();
		//o.pvtShow(); error
		//o.defShow(); error
		//o.protShow(); error
		o.pubShow();

	}

}
