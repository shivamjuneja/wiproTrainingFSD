package exp.methodoverloading;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class OldDateApiEx {
	public static void main(String args[]) throws ParseException {
		String inputDateText="10-03-2022";
		DateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("inut format="+inputDateText);
       Date date=formatter.parse(inputDateText);
		System.out.println("date fetched="+date);
	}

}
