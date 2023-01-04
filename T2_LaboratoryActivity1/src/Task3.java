import java.io.*;
import java.util.*;

public class Task3 {

	public static void main(String[] args)throws IOException, FileNotFoundException {
		File inputFile = new File("C:\\Users\\trist\\eclipse-workspace\\T2_LaboratoryActivity1\\dummy.txt");
		BufferedReader br = new BufferedReader(new FileReader(inputFile));

		String text = null;
		int count = 0;
		int i = 0;
		
		try{
            while(((text = br.readLine()) != null) && i<5){
            	for (int j = 0; j<text.length(); j++) {
        			char ch = text.charAt(j);
        			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
        					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        				count++;
        			}
        		}
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
		
		System.out.println(count);
	}

}
