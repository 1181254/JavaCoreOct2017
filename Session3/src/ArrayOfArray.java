
public class ArrayOfArray {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr1 length is: "+arr1.length);
		System.out.println("arr1[0] is: "+arr1[0]);
		
		// Array of Arrays
		int[][] arr2 = {
							{10,20,30},
							{10,20,30,40,50},
							{10,20},
							{10},
							{10,20,30,40}
					   };
		
		System.out.println("arr2 is: "+arr2);
		System.out.println("arr2 length is: "+arr2.length);
		System.out.println("arr2[0] is: "+arr2[0]);
		System.out.println("arr2[0][0] is: "+arr2[0][0]);
		
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		
		int[][][] arr3 = {
							{
								{10,20,30},
								{10,20,30,40,50},
								{10,20},
								{10},
								{10,20,30,40}
							},
							{
								{10,20,30},
								{10,20,30,40,50},
								{10,20},
								{10},
								{10,20,30,40}
							}
							
					     };	
		System.out.println("arr3 is: "+arr3);
		System.out.println("arr3 length is: "+arr3.length);
		System.out.println("arr3[0] is: "+arr3[0]);
		System.out.println("arr3[0][0] is: "+arr3[0][0]);
		System.out.println("arr3[0][0][0] is: "+arr3[0][0][0]);
		
		
	}

}
