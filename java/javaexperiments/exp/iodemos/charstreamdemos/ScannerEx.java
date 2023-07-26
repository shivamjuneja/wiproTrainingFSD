package exp.iodemos.charstreamdemos;

import java.io.*;
import java.util.*;

public class ScannerEx {

	public static void main(String args[]) {
		InputStream inputStream = System.in;
		Scanner scanner = new Scanner(inputStream);
		System.out.println("enter number");
		int value = scanner.nextInt();
		System.out.println("number entered " + value);
		scanner.close();
	}

}
