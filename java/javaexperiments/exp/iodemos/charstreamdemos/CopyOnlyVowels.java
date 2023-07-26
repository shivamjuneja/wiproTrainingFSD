package exp.iodemos.charstreamdemos;

import java.io.*;


public class CopyOnlyVowels {
	public static void main(String args[]) throws Exception {
		CopyOnlyVowels demo = new CopyOnlyVowels();
		demo.execute();

	}

	void execute() {
		File inputFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File outFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");
		Reader reader =null;
		Writer writer =null;
		try {
			reader = new FileReader(inputFile);
			writer = new FileWriter(outFile);
			int redChar;
			int vowelsCount = 0;
			while ((redChar = reader.read()) != -1) {
				char ch=(char)redChar;
				if(ch=='\n') {
					writer.write(ch);
				}
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					writer.write(redChar);
					vowelsCount++;
				}				
				
			}
			System.out.println("file copy done vowels count=" + vowelsCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			close(reader);
			close(writer);
		}
	}
	
	void close(Reader reader) {
		try {
		if(reader!=null) {
			reader.close();
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	void close(Writer writer) {
		try {
		if(writer!=null) {
			writer.close();
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
