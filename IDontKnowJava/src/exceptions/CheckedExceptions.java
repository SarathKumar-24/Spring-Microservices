package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedExceptions {

//	public static void main(String[] args) {// throws FileNotFoundException,IOException {
//
//		//FileNotFoundException
//		
//		Reader reader=new FileReader("c:\\abc.txt"); 
//		
//		BufferedReader br=new BufferedReader(reader);
//		
//		// IOException
//		br.read();
//		
//		System.out.println("End of program.");
//
//	}
	
	public static void main(String[] args) {

		//FileNotFoundException
		Reader reader=null;
		try {
			reader=new FileReader("c:\\simant\\data\\myfile.txt");
		}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		// IOException
		
		try {
			BufferedReader br=new BufferedReader(reader);  //NullPointerException
			System.out.println((char)br.read());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//SQLException : checked exception
		
		try {
		Class employeeClass= Class.forName("oops.Employee");
		}
		catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
		
	
		System.out.println("End of program.");

	}

}
