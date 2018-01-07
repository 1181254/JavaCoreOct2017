import java.io.File;

public class FileIO {

	public static void main(String[] args) {
		
		try {
			
			//File file = new File("/Users/ishantkumar/Downloads/RTP.java");
			File file = new File("/Users/ishantkumar/Downloads","RTP.java");
			//File file = new File("/Users/ishantkumar/Downloads");
			if(file.exists()){
				if(file.isFile()){
					System.out.println("File: "+file.getName()+" Exists");
				}else{
					System.out.println("Directory: "+file.getName()+" Exists");
				}
			}else{
				System.out.println("No Such File: "+file.getName());
			}
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}

	}

}
