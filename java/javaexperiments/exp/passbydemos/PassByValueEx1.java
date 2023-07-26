package exp.passbydemos;

public class PassByValueEx1 {

    public static void main(String[] args){
        int count=10;
        PassByValueEx1 demo=new PassByValueEx1();
        demo.increment(count);
        System.out.println("inside main count="+count);
    }

    void increment(int count){
        ++count;
        System.out.println("inside increment count="+count);
    }

}

