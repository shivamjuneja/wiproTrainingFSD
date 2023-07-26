package exp.inheritancedemo;

public class EceStudent extends Student{
    private String device;

    public EceStudent(long id, String name,String device){
        super(id,name);
        this.device=device;
    }
    public void setDevice(String device){
        this.device=device;
    }

    public  String getDevice(){
        return device;
    }

}
