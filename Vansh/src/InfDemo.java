interface Inf1{
	void show();
	void hello();
}

interface Inf2{
	void bye();
	void hello();
}

interface Inf3 extends Inf1,Inf2{
	
}


class InfImp implements Inf3{//Inf1,Inf2{
	public void show(){
		System.out.println("This is Show");
	}
	
	public void hello(){
		System.out.println("This is Hello");
	}
	
	public void bye(){
		System.out.println("This is Bye");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		/*Inf1 i1 = new InfImp();
		i1.show();
		i1.hello();
		
		// i1.bye(); error
		
		InfImp ref = (InfImp)i1; // DownCasting
		
		
		Inf2 i2 = ref;//new InfImp(); // UpCasting | Polymorphic Statement
		i2.bye();*/
		
		Inf3 i3 = new InfImp();
		i3.show();
		i3.hello();
		i3.bye();
		
	}

}
