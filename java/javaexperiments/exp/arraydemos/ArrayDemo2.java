package exp.arraydemos;

public class ArrayDemo2 {

    public static void main(String[] args) {
        String words[] = {"hello", "hi", "good"};
        String fruits[] = new String[3];
        fruits[0] = "banana";
        fruits[1] = "apple";
        fruits[2] = "mango";


        for (int i = 0; i < fruits.length; i++) {
            String iterated = fruits[0];
            System.out.println(iterated);
        }


    }
}
