import java.util.Scanner;
public class Lexi{
    public static void main(String a[]){
        int T;
        char op[][];
        char[] p=new char[25];
        char[] s;
        String pp, ss;
        System.out.println("input");
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        op=new char[T][];
         for(int i=0; i<T; i++){
           pp=sc.next();p=pp.toCharArray();
           ss=sc.next();s=ss.toCharArray();
           op[i]=leximtd(p, s);
        }

        System.out.println("\noutput\n");

        for(int i=0; i<T; i++){
            System.out.println(new String(op[i]));
        }

    }

    public static char[] leximtd(char[] p, char [] s){
        char rt[]=new char[100]; int c=0;
        if(p.length==26 && s.length<=100){
            for(int i=0; i<26; i++){
                for(int j=0; j<s.length; j++)
                 if(p[i]==s[j]){ rt[c]=p[i]; c++;}
            }
        }
        else{System.out.println("error"+p.length);}
        return rt;
    }
}
