class App{
	
	static private App a = new App();
	
	private App(){
		System.out.println("App Object Created @ "+this);
	}
	
	public static App getApp(){
		return a;
	}
}

public class SingleTonDemo {

	public static void main(String[] args) {
		
		//App a1 = new App();
		//App a2 = new App();
		
		//System.out.println("a1 is: "+a1);
		//System.out.println("a2 is: "+a2);
		
		App a1 = App.getApp();
		App a2 = App.getApp();
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);

	}

}
