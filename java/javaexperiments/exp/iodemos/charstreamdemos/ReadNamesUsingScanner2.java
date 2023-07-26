package exp.iodemos.charstreamdemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * when names are separated by comma
 *
 */
public class ReadNamesUsingScanner2 {
	
		public static void main(String args[]) {
			File inputFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
			try(Scanner scanner =new Scanner(inputFile)) {	
				while (scanner.hasNextLine()) {
				 String line=scanner.nextLine();
				 line=line.trim();
				 if(line.isEmpty()) {
					continue; 
				 }
				 String names[]=line.split(",");
				 System.out.println("nmes in line="+Arrays.asList(names));
				}
			} 
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			

		}

	

}
