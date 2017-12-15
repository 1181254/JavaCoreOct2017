
public class Session2 {

	public static void main(String[] args) {
		
		// Single Value Containers
		
		//int i = 10; // Single Value Container
		//int j = 10,20; // error
		
		int k = 10;
		
		int m = 100;
		
		
		byte b = 12; // Implicit Down casting
		
		byte var = (byte)256; // Explicit Down casting
		
		System.out.println(var);
		
		long l = 100;
		
		long q = 1000L;
		
		float f = 2.2F;
		double d = 2.2;
		
		char ch = 'A';
		ch = '\u20b9';
		System.out.println("ch is: "+ch);
		
		boolean bool = true;
		bool = false;
		
		String str = "This is Awesome";
		System.out.println("str is: "+str);
		
		//char ch1 = 'A','B'; error, since char or any primtive can store a Single Value
		
		// Multi Value Containers
		int[] arr = {10,20,30,40,50}; // Implict Array Creation
		// arr is a reference variable
		System.out.println("arr is: "+arr); // Address 
		System.out.println("arr[0] is: "+arr[0]);
		System.out.println("arr[4] is: "+arr[4]);
		System.out.println("arr length is: "+arr.length);

		for(int idx=0;idx<arr.length;idx++){
			System.out.print(arr[idx]+"  ");
		}
		
		System.out.println();
		int[] arr1 = new int[]{10,20,30,40,50}; // Explicit Array Creation
		
		arr1[2] = 200;
		
		for(int elm : arr1){ // Enhanced For loop | For-Each Loop
			System.out.print(elm+"  ");
		}
		System.out.println();
		
		int[] arr2 = new int[5]; // Explicit Array Creation with all values as 0
		
		arr2[2] = 200;
		
		for(int elm : arr2){ // Enhanced For loop | For-Each Loop
			System.out.print(elm+"  ");
		}
		
		int[] arr3;
		arr3 = new int[5];
		
		int arr4[] = new int[5];
		
		int a1[],a2[],a3;
		a1 = new int[10];
		a1 = new int[20];
		a3 = 100;
		
		
		int[] a4,a5,a6;
		a4 = new int[2];
		a5 = new int[2];
		a6 = new int[2];
		
		int[][] arr5 = {
							{10,20,30,40,50},
							{10,20,30},
							{10,20},
							{10},
							{10,20,30,40}
					   };
		
		System.out.println("arr5 is: "+arr5);
		System.out.println("arr5 length is: "+arr5.length);
		
		System.out.println("arr5[0] is: "+arr5[0]);
		System.out.println("arr5[0] length is: "+arr5[0].length);
		
		System.out.println("arr5[1] is: "+arr5[1]);
		System.out.println("arr5[1] length is: "+arr5[1].length);
		
		System.out.println("arr5[1][1] is: "+arr5[1][1]);
		
		/*for(int i=0;i<arr5.length;i++){
			for(int j=0;j<arr5[i].length;j++){
				System.out.print(arr5[i][j]+"   ");
			}
			System.out.println();
		}*/
		
		for(int[] tArr : arr5){
			for(int elm : tArr){
				System.out.print(elm+"  ");
			}
			System.out.println();
		}
		
		
		int[][][] arr6 ={ 
			
							{
								{10,20,30,40,50},
								{10,20,30},
								{10,20},
								{10},
								{10,20,30,40}
			   				},
							{
								{10,20,30,40,50},
								{10,20,30},
								{10,20},
								{10},
								{10,20,30,40}
							}
			   				
						};
		
		System.out.println("arr6 length is: "+arr6.length);
		System.out.println("arr6[0][1][2] is: "+arr6[0][1][2]);
		
	}

}
