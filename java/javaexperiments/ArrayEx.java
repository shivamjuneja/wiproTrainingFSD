
class ArrayEx{

public static void main(String args[]){
int numbers[]={10,20,30};
String words[]={"hi" , "hello","bye"};
String fruits[]=new String[3];
fruits[0]="apple";
fruits[1]="mango";
fruits[2]="banana";


for(int i=0;i<numbers.length; i++){
 int iterated=numbers[i];
 System.out.println(iterated);
}

for(int iterated:numbers){
 System.out.println(iterated);
}

System.out.println("iterating on words below");
for(int i=0;i<words.length;i++){
    String iterated=words[i];
    System.out.println(iterated);
    
}
for( String iterated :words ){
   System.out.println(iterated);
 
}


System.out.println("iterating on fruits below");
for(int i=0;i<fruits.length;i++){
    String iterated=words[i];
    System.out.println(iterated);
    
}


}

}
