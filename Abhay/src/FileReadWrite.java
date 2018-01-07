import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {

	public static void main(String[] args) {
		try {
			
			int count = 0;
			
			File file = new File("/Users/ishantkumar/Downloads","RTP.java");
			File file1 = new File("/Users/ishantkumar/Downloads","results.txt");
			
			if(file.exists()){
				if(file.isFile()){
			
					
					FileReader reader = new FileReader(file);
					BufferedReader buffer = new BufferedReader(reader);
					
					String line = "";
					
					while((line = buffer.readLine()) !=null ){
						
						if(line.contains("new")){
							count++;
						}
					
						System.out.println(line);
					}
					
					System.out.println("Total Objects Found: "+count);
					
					buffer.close();
					reader.close();
					
					String data = "This is Awesome!!";
					FileWriter writer = new FileWriter(file1,true); // true means append mode
					writer.write(data);
					writer.write("\nObjects Found in RTP.java: "+count);
					writer.close();
					System.out.println("Contents Written..");
					
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
