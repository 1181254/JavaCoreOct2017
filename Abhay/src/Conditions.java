
public class Conditions {

	public static void main(String[] args) {
		
		int n1 = 110;
		int n2 = 10;
		int n3 = 130;
		
		// Simple if else
		if(n1==n2){
			System.out.println("n1 is equal to n2");
		}else{
			System.out.println("n2 is not equal to n1");
		}
		
		// Nested if/else
		if(n1 > n2){
			if(n1 > n3){
				System.out.println("n1 is greatest");
			}else{
				System.out.println("n3 is greatest");
			}
		}else{
			if(n2 > n3){
				System.out.println("n2 is greatest");
			}else{
				System.out.println("? is greatest");
			}
		}
		
		if(n1>n2 && n1>n3){
			System.out.println("n1 is greatest");
		}else{
			if(n2>n3){
				System.out.println("n2 is greatest");
			}else{
				
			}
		}
		
		int p = 90;
		int c = 95;
		int m = 80;
		
		float avg = (p+c+m)/3;
		
		// Ladder if/else
		if(avg >= 80){
			System.out.println("Grade A is awarded !!");
		}else if(avg>=70 && avg<80){
			System.out.println("Grade B is awarded !!");
		}else if(avg>=60 && avg<70){
			System.out.println("Grade C is awarded !!");
		}else{
			System.out.println("Grade D is awarded !!");
		}
		
		

	}

}
