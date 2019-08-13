import java.util.Scanner;

public class Cadbury{
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int l1=s.nextInt();
        int l2=s.nextInt();
        int l3=s.nextInt();
        int l4=s.nextInt();
        s.close();
        int c=0;

        for(int i=l1; i<=l2; i++){
            for(int j=l3; j<=l4; j++){
                if(i>=j) c+=parts(i, j);
            }
        }
        System.out.println(c);
    }
    public static int parts(int len,int  wid){
        int c=0;int a;

       while(len!=wid){
           a=len-wid; 
           if(a<wid) {len=wid; wid=a;}
           else{len=a; }
            c++;
       }
       return c+1;
    }
}
