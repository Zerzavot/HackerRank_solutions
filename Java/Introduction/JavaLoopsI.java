

package hackerrankjava1;
import java.util.Scanner;

public class JavaLoopsI {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String n=String.valueOf(N);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
            String is=String.valueOf(i);
            int result=N*i;
            String r=String.valueOf(result);
            System.out.println(n +" x "+is+" = "+r);
        }
        scanner.close();
    }
}
