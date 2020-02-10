
package hackerrankjava1;
import java.util.*;
public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int lineNo = 0;
        while(s.hasNext()){
            lineNo++;
            System.out.println(""+lineNo+" "+s.nextLine());
        }
    }
}



