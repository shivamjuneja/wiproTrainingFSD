package exp.inheritancedemo;

public class CseStudent extends Student{
    private String languageUsed;

    public CseStudent(long id, String name, String language){
        super(id,name);
        this.languageUsed=language;
    }

    public String getLanguageUsed(){
        return languageUsed;
    }
    public void  setLanguageUsed(String language){
        this.languageUsed = language;
    }


}
