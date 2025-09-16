package practiceChatgpt.Inheritance;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		String msg = null;
		msg = "Sample.txt";
		// TODO Auto-generated method stub
		File file = new File(msg);
		try {
			if(file.createNewFile()) {
				System.out.println("File created succesfully!"+ file.getName());
				}
			else {
				System.out.println("File already exists");
			}
			
		} catch (IOException e) {
			e.printStackTrace();;
			
		}
		

	}

}
