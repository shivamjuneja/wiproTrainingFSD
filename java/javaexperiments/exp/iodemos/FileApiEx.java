package exp.iodemos;

import java.io.*;

public class FileApiEx {
	
	public static void main(String args[]) {
		FileApiEx demo=new FileApiEx();
		demo.execute();
		
	}
	
	public void execute() {
		File dir=new File("/home/vineet/Documents/wipro/mydir");
		boolean isDir1=dir.isDirectory();
		boolean isExists1=dir.exists();
		
		System.out.println("mydir is a directory "+isDir1+" exists="+isExists1);
		
		File file=new File("/home/vineet/Documents/wipro/mydir/names.txt");
		boolean isDir2=file.isDirectory();
		boolean isExists2=file.exists();
		
		System.out.println("names.txt is a directory "+isDir2+" exists="+isExists2);
			
		System.out.println("***listing files in mydir");
		File files[]=dir.listFiles();
	 
		for(File iterated:files) {
			System.out.println("iterated file="+iterated.getName());
		}
		
	}
	

}
