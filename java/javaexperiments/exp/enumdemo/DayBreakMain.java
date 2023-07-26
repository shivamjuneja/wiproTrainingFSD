package exp.enumdemo;

public class DayBreakMain {

    public static void main(String args[]){
        DayBreak break1=DayBreak.MorningTea;
        DayBreak break2=DayBreak.MorningTea;

        boolean isEquals=break1.equals(break2);
        System.out.println("is equals "+isEquals);
        String break1Name=break1.name();
        int break1Ordinal=break1.ordinal();
        System.out.println("break1 name="+break1Name +" oridinal="+break1Ordinal);



        DayBreak breaks[]=DayBreak.values();
        for(DayBreak iterated:breaks){
            System.out.println(iterated);
            System.out.println(iterated.ordinal());

        }


    }
}
