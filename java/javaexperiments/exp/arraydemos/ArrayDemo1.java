package exp.arraydemos;

/**
 *   10  11 12
 *   0 , 1 ,2 ,3
 */
public class ArrayDemo1 {
    public static void main(String args[]){
        int array1[]={10,11,12,13};

        int array2[]=new int[4];
        array2[0]=10;
        array2[1]=11;
        array2[2]=12;
        array2[3]=13;

        for(int i=0;i<array1.length;i++){
            int iterated =array1[i];
            System.out.println(iterated);
        }


    }
}
