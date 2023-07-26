package exp.enumdemo;

public enum Category {

    Phone("ph", "Android Phones and Iphones"),
    Laptop("lap","Laptops and Desktops"),
    Television("tv","Lcs, Smart"),
    Groceries("Groc", "Groceries, vegetables");

    private String categoryCode, displayValue;

    public String getCategoryCode(){
        return categoryCode;
    }

    public String getDisplayValue(){
        return displayValue;
    }


    Category(String code, String displayValue){
        this.categoryCode=code;
        this.displayValue=displayValue;
    }



}
