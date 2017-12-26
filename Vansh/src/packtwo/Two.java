package packtwo;

class One{
	private void pvtShow(){
		System.out.println("This is a private show of One in packtwo");
	}
	
	void defShow(){
		System.out.println("This is a default show of One in packtwo");
	}
	
	protected void protShow(){
		System.out.println("This is a protected show of One in packtwo");
	}
	
	public void pubShow(){
		System.out.println("This is a public show of One in packtwo");
	}
}

public class Two {
	private void pvtShow(){
		System.out.println("This is a private show of Two in packtwo");
	}
	
	void defShow(){
		System.out.println("This is a default show of Two in packtwo");
	}
	
	protected void protShow(){
		System.out.println("This is a protected show of Two in packtwo");
	}
	
	public void pubShow(){
		System.out.println("This is a public show of Two in packtwo");
	}
}

class Three{
	private void pvtShow(){
		System.out.println("This is a private show of Three in packtwo");
	}
	
	void defShow(){
		System.out.println("This is a default show of Three in packtwo");
	}
	
	protected void protShow(){
		System.out.println("This is a protected show of Three in packtwo");
	}
	
	public void pubShow(){
		System.out.println("This is a public show of Three in packtwo");
	}
}

// error
/*private class Four{
	
}

protected class Five{
	
}*/
