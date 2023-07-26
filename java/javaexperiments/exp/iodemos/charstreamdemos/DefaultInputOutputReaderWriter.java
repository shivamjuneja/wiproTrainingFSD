package exp.iodemos.charstreamdemos;

import java.io.*;

public class DefaultInputOutputReaderWriter {

	public static void main(String args[]) {
		DefaultInputOutputReaderWriter demo = new DefaultInputOutputReaderWriter();
		demo.execute();
	}

	void execute() {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new InputStreamReader(inputStream);
			writer = new OutputStreamWriter(outputStream);
			int charsCount=0;
			int redChar;
			System.out.println("write in input stream, it will be prined back");
			while ((redChar = reader.read()) != -1) {
				char ch = (char) redChar;
				if(ch=='z') {
					break;
				}
				writer.write(ch);
                 charsCount++;
			}
			System.out.println("chars count" + charsCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(reader);
			close(writer);
		}
	}

	void close(Reader reader) {
		try {
			if (reader != null) {
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void close(Writer writer) {
		try {
			if (writer != null) {
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
