import java.util.Scanner;

public class pattern{
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int b=N*N+1;
        if(N>1&&N<=100){int aa=1;
           // ptrn(N, N);
           for(int i=N; i>=1; i--){
            for (int j=1; j<=N-i; j++) System.out.print("**");
               for(int j=1; j<=2*i; j++){
                  if(i==N) {
                      if(j<=i){ System.out.print(aa+"0"); aa++;}
                      else { if (j==2*i) System.out.print((b+j-i-1)); else System.out.print((b+j-i-1)+"0");}
                  }
                  else {if(j<=i){System.out.print(aa+"0");aa++;} else {if(j==i+1) b=b-i; System.out.print((b+j-i-1)); if(j!=2*i)System.out.print(0);}}
               }
               System.out.println();  
            }
        }
        else{
        }
    }

  
}
