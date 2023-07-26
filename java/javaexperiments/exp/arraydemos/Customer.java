package exp.arraydemos;

public class Customer {
   private String name;

   private int age;

   public  Customer(String name, int age){
       this.name=name;
       this.age=age;
   }

   public void setName(String name){
       this.name=name;
   }

    public String getName(){
        return name;
    }

    public int getAge(){
     return age;
    }

}
