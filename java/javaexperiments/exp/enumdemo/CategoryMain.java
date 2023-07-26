package exp.enumdemo;

public class CategoryMain {

    public static void main(String[]  args){
        Category category1=Category.Groceries;
        String categoryCode=category1.getCategoryCode();
        String displayValue=category1.getDisplayValue();

        System.out.println("category code="+categoryCode);
        System.out.println("display value="+displayValue);
        System.out.println("*********printing all categories");

        Category categories[]=Category.values();
        for (Category iterated: categories){
            System.out.println(iterated);
            System.out.println("category code "+iterated.getCategoryCode());
            System.out.println("display value="+iterated.getDisplayValue());
        }
    }

}
