
package hackerrankjava1;
import java.util.Scanner;

public class JavaOutputFormatting {
     public static String multiplyA(int width,String s ) {
        
        for(int i=0; i<width-1; i++)
        {s= s + " ";}
        return s;
    }
    public static String multiplyB(int width,String s ) {
        if(width==0){return "";}
        else if(width==1){return "0";}
        else {return "00";}
        
        
    }
   
    public static void main(String[] args) {

             Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int l=s1.length();
                int space=15-l;
                //
                int li=(int) (Math.log10(x) + 1); // 35=2 li=size 
                int w=3-li; //w=1
                
                
                // Number of Digits in an Integer
                
                System.out.println(s1+multiplyA(space," ")+multiplyB(w,"0")+x);
                
            } 
            System.out.println("================================");
    }
}

  
  
   
    
   

