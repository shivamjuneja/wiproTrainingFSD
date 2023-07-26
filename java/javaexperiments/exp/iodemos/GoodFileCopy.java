package exp.iodemos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class GoodFileCopy {
	public static void main(String args[]) throws Exception {
		GoodFileCopy demo = new GoodFileCopy();
		demo.execute();

	}

	void execute() {
		File inputFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File outFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");
		InputStream inputStream =null;
		OutputStream outputStream =null;
		try {
			inputStream = new FileInputStream(inputFile);
			BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream); 
			outputStream = new FileOutputStream(outFile);
			BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);

			byte redBytes[]=new byte[1024];
			int bytesCount = 0, totalBytesCount=0;
			
			while ((bytesCount = inputStream.read(redBytes)) != -1) {
				bufferedOutputStream.write(redBytes,0,bytesCount);
				totalBytesCount=totalBytesCount+bytesCount;
				
			}
		    bufferedOutputStream.flush();
			
			System.out.println("file copy done bytes count=" + totalBytesCount);
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
