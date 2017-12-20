/*class Login{
	
	Login(){
		System.out.println("Login Object Created");
	}
	
	void loginUser(){
		System.out.println("Login User");
	}
}*/

/*abstract class Login{
	
	Login(){
		System.out.println("Login Object Created");
	}
	
	abstract void loginUser();
	
	void fun(){
		System.out.println("This is fun");
	}
}*/

interface Login{
	
	void loginUser(); //public abstract void loginUser();
}

class FaceBookLogin implements Login{//extends Login{ // IS-A | FacebookLogin IS A Login
	
	FaceBookLogin(){
		System.out.println("FaceBookLogin Object Created");
	}
	
	public void loginUser(){
		System.out.println("Login User with Facebook");
	}
}

class GoogleLogin implements Login{//extends Login{ // IS-A | GoogleLogin IS A Login
	
	GoogleLogin(){
		System.out.println("GoogleLogin Object Created");
	}
	
	public void loginUser(){
		System.out.println("Login User with Google");
	}
}

class TwitterLogin implements Login{//extends Login{ // IS-A | TwitterLogin IS A Login
	
	TwitterLogin(){
		System.out.println("TwitterLogin Object Created");
	}
	
	public void loginUser(){
		System.out.println("Login User with Twitter");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*Login lRef;
		lRef = new Login();

		lRef.loginUser();
		
		FaceBookLogin fbRef;
		fbRef = new FaceBookLogin();
		
		fbRef.loginUser();*/
		
		Login lRef;
		
		lRef = new FaceBookLogin();
		lRef.loginUser();
		
		System.out.println("-------------");
		
		lRef = new GoogleLogin();
		lRef.loginUser();
		
		System.out.println("-------------");
		
		lRef = new TwitterLogin();
		lRef.loginUser();	
		
		System.out.println("-------------");
		
		//lRef = new Login(); // No Objects can be created by User
		//lRef.loginUser();
		
	}

}
