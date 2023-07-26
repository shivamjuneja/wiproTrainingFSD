package exp.iodemos;

import java.io.*;

public class BadFileCopy {

	public static void main(String args[]) throws Exception {
		BadFileCopy demo = new BadFileCopy();
		demo.execute();

	}

	void execute() {
		File inputFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File outFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");
		InputStream inputStream =null;
		OutputStream outputStream =null;
		try {
			inputStream = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outFile);
			int redByte;
			int bytesCount = 0;
			while ((redByte = inputStream.read()) != -1) {
				outputStream.write(redByte);
				bytesCount++;
			}
			System.out.println("file copy done bytes count=" + bytesCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			close(inputStream);
			close(outputStream);
		}
	}
	
	void close(InputStream stream) {
		try {
		if(stream!=null) {
			stream.close();
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	void close(OutputStream stream) {
		try {
		if(stream!=null) {
			stream.close();
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
