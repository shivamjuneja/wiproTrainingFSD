package exp.iodemos.charstreamdemos;

import java.io.*;
import java.util.*;


/**
 * 
 * when names are separated by space, the easiest solution 
 * 
 */
public class ReadNamesUsingScanners1 {

	public static void main(String args[]) {
		File inputFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		try(Scanner scanner =new Scanner(inputFile)) {			
			while (scanner.hasNext()) {
			 String name=scanner.next();
			 System.out.println(name+" lenth="+name.length());
			}
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
