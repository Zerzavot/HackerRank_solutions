
package hackerrankjava1;

import java.util.Scanner;


public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int w=0;w<t;w++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result=0;
            
            for(int i=1;i<=n;i++){
                
                int r2=0;
                for(int j=0;j<i;j++){
                    
                    r2+=(Math.pow(2, j)*b);
                   
                }
                result=a+r2;
                System.out.print(result);
                System.out.print(" ");
               
            }
            System.out.println();
        }
        in.close();
    }
}
