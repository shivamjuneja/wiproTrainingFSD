package exp.iodemos.charstreamdemos;

import java.io.*;

public class FileCopyChangeString {

	public static void main(String args[]) {
		FileCopyChangeString demo = new FileCopyChangeString();
		demo.execute();
	}

	void execute() {
		File inputFile = new File("/home/vineet/Documents/wipro/mydir/names.txt");
		File outFile = new File("/home/vineet/Documents/wipro/mydir/namescopy.txt");

		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(reader);
			writer = new FileWriter(outFile);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			String readLine;
			while ((readLine = bufferedReader.readLine()) != null) {
				if (readLine.contains("mohit")) {
					readLine = readLine.replace("mohit", "somnath");
					readLine=readLine;

				}
				bufferedWriter.write(readLine+"\n");

			}

			bufferedWriter.flush();
			System.out.println("file copy done, mohit changed in file to somnath");
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
