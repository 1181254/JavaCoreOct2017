import javax.swing.plaf.synth.SynthSpinnerUI;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// Primitive Type
		int i = 10;
		System.out.println("i is: "+i);
		
		
		// Multi Value Container -> Array
		// Reference Type
		//int[] j = {10,20,30,40,50}; // Implicit Statement
		//int j[] = {10,20,30,40,50};
		
		int[] j = new int[]{10,20,30,40,50}; // Explicit Statement
		
		System.out.println("j is: "+j);
		System.out.println("size of j is: "+j.length);
		System.out.println("j[0] is: "+j[0]);
		System.out.println("j[4] is: "+j[4]);

		int sum = 0;
		
		for(int idx=0; idx<j.length; idx++){
			System.out.println(j[idx]);
			sum = sum+j[idx];
		}
		
		System.out.println("sum is: "+sum);
	
		for(int idx=(j.length-1); idx>=0; idx--){
			System.out.println(j[idx]);
		}
		
		System.out.println("-------------");
		
		int k[] = new int[10]; // 0 - 9
		
		/*for(int p=0;p<k.length;p++){
			k[p] = 10+p;
		}*/
		
		k[4] = 100;
		k[0] = 200;
		k[9] = 500;
		
		/*for(int idx=(k.length-1); idx>=0; idx--){
			System.out.println(k[idx]);
		}*/
		
		// Enhanced For Loop
		for(int value : k){
			System.out.println(value);
		}
		
		String[] names = {"John","Jennie","Jack","Jim","Joe"};
		System.out.println(names[2]);
		System.out.println(names.length);
		
		/*for(int m=0;m<names.length;m++){
			System.out.println(names[m]);
		}*/
		
		for(String s : names){
			System.out.println(s);
		}
		
		System.out.println(names);
		
		char[] ch = {'A','p','$'};
		System.out.println(ch);
		System.out.println(ch.toString());

		// Array of Arrays
		int[][] arr = {
						{10,20,30,40,50},
						{10,20,30},
						{10,20,30,40},
						{10,20},
						{10}
					  };
		
		System.out.println(arr);
		System.out.println(arr.length);
		
		System.out.println(arr[0].length);
		System.out.println(arr[4].length);
		
		System.out.println(arr[0][1]);
		System.out.println(arr[3][0]);
		
		System.out.println("----------------");
		
		// Nesting of Loops
		for(int out=0;out<arr.length;out++){
			for(int in=0;in<arr[out].length;in++){
				System.out.print(arr[out][in]+"  ");
			}
			System.out.println();
		}
		
		
	}

}
