import java.io.*;
import java.util.*;

public class Task4 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter file name: "); //Asks for file name, yung name lang, walang extention(.txt). EXAMPLE "Enter file name: dummy"
		String name = in.next(); //saves the user input
		String filePath = "C:\\Users\\trist\\eclipse-workspace\\T2_LaboratoryActivity1\\"+name+".txt"; //File source kung san nakalagay yung dummy.txt na file
		
		File inputFile = new File(filePath); //tinatamad na ko mag comment...
		String[] words = null;
		int wordCount = 0;
		FileReader fr = new FileReader(inputFile);
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		try {
			while((s = br.readLine())!= null) {
			words = s.split(" ");
			wordCount = wordCount + words.length;
		}
		fr.close();
		System.out.println("Number of words in this file: "+wordCount);
		}
		catch(Exception e) {
			System.out.println("An error has occured: "+e.getMessage());
		}
	
	}

}
