import java.io.*;
import java.util.*;

public class Task1 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		File inputFile = new File("C:\\Users\\trist\\eclipse-workspace\\T2_LaboratoryActivity1\\data.txt");
		Scanner inFile = new Scanner(inputFile);

		Writer fw = null;

		// ######################################################//

		int sum = 0;

		try {
			while (inFile.hasNextLine()) {
				int nextInt = inFile.nextInt();
				sum = sum + nextInt;
			}
		} catch (Exception e) {
			System.out.println("An error has occured: " + e.getMessage());
		} finally {
			inFile.close();
		}

		// ######################################################//
		
		String out = Integer.toString(sum);
		try {
			fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("sum.txt"), "utf-8"));
			fw.write(out);
			System.out.println("Completed.");
		}
		catch(IOException e) {
			System.out.println("An error has occured: "+e.getMessage());
		}
		finally{
		try {fw.close();} catch(Exception e) {}	
		}

		// ######################################################//

	}

}
