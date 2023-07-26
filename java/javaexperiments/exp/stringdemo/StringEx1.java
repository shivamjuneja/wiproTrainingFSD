package exp.stringdemo;

public class StringEx1 {

    public static void main(String args[]) {
        String str = "goodmorning";
        char index4Char = str.charAt(4);
        System.out.println("char at index 4=" + index4Char);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("char at index  =" + i + "=" + ch);
        }
        boolean contains = str.contains("rni");
        boolean startsWith = str.startsWith("good");
        System.out.println("string starting with good=" + startsWith);
        boolean endsWith=str.endsWith("morning");
        System.out.println("string ends with morning=" + startsWith);

        String str2="hibyebyeok";
        //first occurenc of "ye"
        int indexOfYE=str2.indexOf("ye");
        //last occure of "ye"
        int lastIndexOfYE=str2.lastIndexOf("ye");
        System.out.println("first occurence of ye="+indexOfYE);
        System.out.println("last occurence of ye="+lastIndexOfYE);

        String str3="good,morning,bye";
        String parts[]=str3.split(",");
        for(String part:parts){
            System.out.println("part="+part);
        }


        boolean isEmpty=str3.isEmpty();
        System.out.println("is string empty="+isEmpty);

        String str4=" hi ";
        str4=str4.trim();
        boolean isEquals= str4.equals("hi");
        System.out.println("str4 equals hi="+isEquals);

        String str51="Hello";
        String str52="helLO";
        //str51.toLowerCase().equals(str52.toLowerCase());
        boolean isEquals2=str51.equalsIgnoreCase(str52);
        System.out.println("str51 without case is equal="+isEquals2);

        String str6="goodbyeokbye";
        String replaced=str6.replace("bye","hi");
        System.out.println("replaced="+replaced);


        String str7="todayismonday";
        int startISIndex=str7.indexOf("is");
        String substring1=str7.substring(startISIndex);

        //index at 2 will be part of substring, character at index 6 will not be part of substring
        String substring2=str7.substring(2,6);
        System.out.println("substring from index2 to 6 "+substring2);


    }
}
