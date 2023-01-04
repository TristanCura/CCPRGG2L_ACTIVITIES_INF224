import java.io.*;
import java.util.*;

public class Task2 {

	public static void main(String[] args)throws IOException, FileNotFoundException {
		File inputFile = new File("C:\\Users\\trist\\eclipse-workspace\\T2_LaboratoryActivity1\\dummy.txt");
		BufferedReader br = new BufferedReader(new FileReader(inputFile));

		int i = 0;
		try{
            String text;
            while(((text = br.readLine()) != null) && i<5){
                System.out.println(text);
                i++;
            }
        }
        catch(Exception e){
            System.out.println("There is an error reading the file: ");
            System.out.println(e.getMessage());
        }
        finally{
            br.close();
        }
	}

}
